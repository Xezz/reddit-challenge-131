package org.xezz.testchallenge.validation;

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
public class ValidatorBuilderTest {
    @Test
    public void testBuildLowerCaseTester() throws Exception {
        final Validator validator = ValidatorBuilder.buildTester(TestType.LOWERCASE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(LowerCaseValidator.class)));
    }

    @Test
    public void testBuildReverseTester() throws Exception {
        final Validator validator = ValidatorBuilder.buildTester(TestType.REVERSE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(ReverseValidator.class)));
    }

    @Test
    public void testBuildUpperCaseTester() throws Exception {
        final Validator validator = ValidatorBuilder.buildTester(TestType.UPPERCASE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(UpperCaseValidator.class)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testBuildInvalidTester() throws Exception {
        ValidatorBuilder.buildTester(null);
    }
}
