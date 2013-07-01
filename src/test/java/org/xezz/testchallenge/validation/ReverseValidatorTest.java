package org.xezz.testchallenge.validation;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 12:36
 */
public class ReverseValidatorTest {
    private static final String INPUT = "AccFggT";
    private static final String VALID_RESULT = "TggFccA";
    private final ReverseValidator validator = new ReverseValidator();

    @Test
    public void testValidate() throws Exception {
        Assert.assertThat("Reversed String didn't match", true, is(validator.validate(INPUT, VALID_RESULT)));
    }

    @Test
    public void testValidateSameStringNonReversed() throws Exception {
        Assert.assertThat("Same String matched", false, is(validator.validate(INPUT, INPUT)));
    }

    @Test
    public void testValidateShorterStringNotMatching() throws Exception {
        Assert.assertThat("Shorter String matched", false, is(validator.validate(INPUT, VALID_RESULT.substring(2))));
    }

    @Test
    public void testValidateLongerStringNotMatching() throws Exception {
        Assert.assertThat("Longer String matched", false, is(validator.validate(INPUT, VALID_RESULT + VALID_RESULT)));
    }
}
