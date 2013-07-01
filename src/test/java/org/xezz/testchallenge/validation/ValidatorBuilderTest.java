package org.xezz.testchallenge.validation;

import org.junit.Assert;
import org.junit.Test;
import org.xezz.testchallenge.validation.impl.LowerCaseValidator;
import org.xezz.testchallenge.validation.impl.ReverseValidator;
import org.xezz.testchallenge.validation.impl.UpperCaseValidator;
import org.xezz.testchallenge.validation.type.TestType;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 12:00
 */
public class ValidatorBuilderTest {
    @Test
    public void testBuildLowerCaseValidator() throws Exception {
        final Validator validator = ValidatorBuilder.buildValidator(TestType.LOWERCASE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(LowerCaseValidator.class)));
    }

    @Test
    public void testBuildReverseValidator() throws Exception {
        final Validator validator = ValidatorBuilder.buildValidator(TestType.REVERSE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(ReverseValidator.class)));
    }

    @Test
    public void testBuildUpperCaseValidator() throws Exception {
        final Validator validator = ValidatorBuilder.buildValidator(TestType.UPPERCASE);
        Assert.assertThat("Returned Validator was of wrong type", validator, is(instanceOf(UpperCaseValidator.class)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testBuildInvalidValidator() throws Exception {
        ValidatorBuilder.buildValidator(null);
    }
}
