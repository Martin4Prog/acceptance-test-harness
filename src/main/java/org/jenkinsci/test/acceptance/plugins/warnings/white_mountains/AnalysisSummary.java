package org.jenkinsci.test.acceptance.plugins.warnings.white_mountains;

import java.util.List;

import org.jenkinsci.test.acceptance.po.Build;
import org.jenkinsci.test.acceptance.po.ContainerPageObject;
import org.jenkinsci.test.acceptance.po.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Page object for the AnalysisSummary (Result-Page) of the warnings plugin (white mountains release).
 *
 * @author Michaela Reitschuster
 * @author Alexandra Wenzel
 * @author Manuel Hampp
 */
public class AnalysisSummary extends ContainerPageObject {
    /**
     * Creates a new PageObject which represents the summary page of a build.
     */
    public AnalysisSummary(final Build build) {
        super(build, build.url);
    }

    public SummaryBoxPageArea getSummaryBoxByName(String pluginName) {
        return new SummaryBoxPageArea(pluginName.toLowerCase());
    }

    private WebElement getBuildTitle() {
        return find(By.className("build-caption"));
    }

    public String getBuildState() {
        return getBuildTitle().findElement(By.tagName("img")).getAttribute("title");
    }

    /**
     * Summary Box of a issue recorder result.
     *
     * @author Michaela Reitschuster
     * @author Alexandra Wenzel
     * @author Manuel Hampp
     */
    public class SummaryBoxPageArea {
        private final WebElement summary;
        private final WebElement title;
        private final List<WebElement> resultList;
        private final String id;

        SummaryBoxPageArea(String id) {
            this.id = id;
            summary = find(By.id(id + "-summary"));
            title = find(By.id(id + "-title"));
            resultList = initResultList();
        }

        private List<WebElement> initResultList() {
            return summary.findElements(by.xpath("./ul/li"));
        }

        /**
         * Clicks the title link that opens the details page with the analysis results.
         *
         * @return the details page with the analysis result
         */
        public AnalysisResult clickTitleLink() {
            return openPage(getTitleResultLink(), AnalysisResult.class);
        }

        /**
         * Clicks the info link that opens the messages page showing all info and error messages.
         *
         * @return the messages page showing all info and error messages
         */
        public LogMessagesView clickInfoLink() {
            return openPage(getTitleResultInfoLink(), LogMessagesView.class);
        }

        /**
         * Clicks the new link that opens details page with the analysis results - filtered by new issues.
         *
         * @return the details page with the analysis result
         */
        public AnalysisResult clickNewLink() {
            return openPage(findClickableResultEntryByNamePart("new"), AnalysisResult.class);
        }

        /**
         * Clicks the reference build link that opens details page with the analysis results of the reference build.
         *
         * @return the details page with the analysis result of the reference build
         */
        public AnalysisResult clickReferenceBuildLink() {
            return openPage(findClickableResultEntryByNamePart("Reference"), AnalysisResult.class);
        }

        private <T extends PageObject> T openPage(final WebElement link, final Class<T> type) {
            String href = link.getAttribute("href");
            T result = newInstance(type, injector, url(href), id);
            link.click();

            return result;
        }

        /**
         * Returns the qualitygate result of this parser, if set.
         *
         * @return Success - if the quality gate thresholds have not been reached. Failed - otherwise.
         */
        public String getQualityGateResult() {
            for (WebElement el : resultList) {
                if (el.getText().contains("Quality gate")) {
                    return el.findElement(by.tagName("img")).getAttribute("title");
                }
            }
            return null;
        }

        /**
         * Returns a clickable WebElement (a-tag), by a part of the elements text.
         *
         * @param namePart
         *         part of the visible text (should be unique within the item list)
         *
         * @return WebElement that belongs to the name part
         */
        public WebElement findClickableResultEntryByNamePart(String namePart) {
            for (WebElement el : resultList) {
                if (el.getText().contains(namePart)) {
                    return el.findElement(by.tagName("a"));
                }
            }
            return null;
        }

        /**
         * Returns the complete visible text by a part of the elements text.
         *
         * @param namePart
         *         part of the visible text (should be unique within the item list)
         *
         * @return String that belongs to the name part
         */
        public String findResultEntryTextByNamePart(String namePart) {
            for (WebElement el : resultList) {
                if (el.getText().contains(namePart)) {
                    return el.getText();
                }
            }
            return null;
        }

        public WebElement getSummary() {
            return summary;
        }

        public WebElement getTitleResultLink() {
            return summary.findElement(by.href(this.id + "Result"));
        }

        public WebElement getTitleResultInfoLink() {
            return summary.findElement(by.href(this.id + "Result/info"));
        }

        public WebElement getTitle() {
            return title;
        }
    }
}
