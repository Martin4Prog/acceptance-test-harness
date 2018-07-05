package plugins.warnings.assertions;

import org.jenkinsci.test.acceptance.plugins.warnings.white_mountains.DefaultWarningsTableRow;

/**
 * {@link DefaultWarningsTableRow} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, extend {@link
 * AbstractDefaultWarningsTableRowAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class DefaultWarningsTableRowAssert extends
        AbstractDefaultWarningsTableRowAssert<DefaultWarningsTableRowAssert, DefaultWarningsTableRow> {

    /**
     * Creates a new <code>{@link DefaultWarningsTableRowAssert}</code> to make assertions on actual
     * DefaultWarningsTableRow.
     *
     * @param actual
     *         the DefaultWarningsTableRow we want to make assertions on.
     */
    public DefaultWarningsTableRowAssert(DefaultWarningsTableRow actual) {
        super(actual, DefaultWarningsTableRowAssert.class);
    }

    /**
     * An entry point for DefaultWarningsTableRowAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br> With a static import, one can write directly: <code>assertThat(myNormalAbstractIssuesTableRow)</code>
     * and get specific assertion with code completion.
     *
     * @param actual
     *         the DefaultWarningsTableRow we want to make assertions on.
     *
     * @return a new <code>{@link DefaultWarningsTableRowAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static DefaultWarningsTableRowAssert assertThat(DefaultWarningsTableRow actual) {
        return new DefaultWarningsTableRowAssert(actual);
    }
}