package plugins.warnings.assertions;

import org.jenkinsci.test.acceptance.plugins.warnings.white_mountains.AbstractNonDetailsIssuesTableRow;

/**
 * {@link AbstractNonDetailsIssuesTableRow} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, extend {@link
 * AbstractAbstractNonDetailsIssuesTableRowAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class AbstractNonDetailsIssuesTableRowAssert extends
        AbstractAbstractNonDetailsIssuesTableRowAssert<AbstractNonDetailsIssuesTableRowAssert, AbstractNonDetailsIssuesTableRow> {

    /**
     * Creates a new <code>{@link AbstractNonDetailsIssuesTableRowAssert}</code> to make assertions on actual
     * AbstractNonDetailsIssuesTableRow.
     *
     * @param actual
     *         the AbstractNonDetailsIssuesTableRow we want to make assertions on.
     */
    public AbstractNonDetailsIssuesTableRowAssert(AbstractNonDetailsIssuesTableRow actual) {
        super(actual, AbstractNonDetailsIssuesTableRowAssert.class);
    }

    /**
     * An entry point for AbstractNonDetailsIssuesTableRowAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br> With a static import, one can write directly: <code>assertThat(myAbstractNonDetailsAbstractIssuesTableRow)</code>
     * and get specific assertion with code completion.
     *
     * @param actual
     *         the AbstractNonDetailsIssuesTableRow we want to make assertions on.
     *
     * @return a new <code>{@link AbstractNonDetailsIssuesTableRowAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static AbstractNonDetailsIssuesTableRowAssert assertThat(AbstractNonDetailsIssuesTableRow actual) {
        return new AbstractNonDetailsIssuesTableRowAssert(actual);
    }
}