package org.xezz.testchallenge.tester;

import org.junit.Assert;
import org.junit.Test;
import org.xezz.testchallenge.TestType;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 12:00
 */
public class TesterBuilderTest {
    @Test
    public void testBuildLowerCaseTester() throws Exception {
        final Testable testable = TesterBuilder.buildTester(TestType.LOWERCASE);
        Assert.assertThat("Returned Testable was of wrong type", testable, is(instanceOf(LowerCaseTester.class)));
    }

    @Test
    public void testBuildReverseTester() throws Exception {
        final Testable testable = TesterBuilder.buildTester(TestType.REVERSE);
        Assert.assertThat("Returned Testable was of wrong type", testable, is(instanceOf(ReverseTester.class)));
    }

    @Test
    public void testBuildUpperCaseTester() throws Exception {
        final Testable testable = TesterBuilder.buildTester(TestType.UPPERCASE);
        Assert.assertThat("Returned Testable was of wrong type", testable, is(instanceOf(UpperCaseTester.class)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testBuildInvalidTester() throws Exception {
        TesterBuilder.buildTester(null);
    }
}
