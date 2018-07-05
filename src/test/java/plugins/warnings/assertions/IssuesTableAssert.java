package plugins.warnings.assertions;

import org.jenkinsci.test.acceptance.plugins.warnings.white_mountains.IssuesTable;

/**
 * {@link IssuesTable} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, extend {@link
 * AbstractIssuesTableAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class IssuesTableAssert extends AbstractIssuesTableAssert<IssuesTableAssert, IssuesTable> {

    /**
     * Creates a new <code>{@link IssuesTableAssert}</code> to make assertions on actual IssuesTable.
     *
     * @param actual
     *         the IssuesTable we want to make assertions on.
     */
    public IssuesTableAssert(IssuesTable actual) {
        super(actual, IssuesTableAssert.class);
    }

    /**
     * An entry point for IssuesTableAssert to follow AssertJ standard <code>assertThat()</code> statements.<br> With a
     * static import, one can write directly: <code>assertThat(myIssuesTable)</code> and get specific assertion with
     * code completion.
     *
     * @param actual
     *         the IssuesTable we want to make assertions on.
     *
     * @return a new <code>{@link IssuesTableAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static IssuesTableAssert assertThat(IssuesTable actual) {
        return new IssuesTableAssert(actual);
    }
}