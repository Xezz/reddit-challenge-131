package org.xezz.testchallenge.validation;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 13:16
 */
public class UpperCaseValidatorTest {
    private static final String INPUT = "AAxccFfGHb";
    private static final String VALID_RESULT = "AAXCCFFGHB";
    private final UpperCaseValidator validator = new UpperCaseValidator();

    @Test
    public void testValidate() throws Exception {
        Assert.assertThat("Correct validation failed", true, is(validator.validate(INPUT, VALID_RESULT)));
    }

    @Test
    public void testValidateDoesNotMatchSame() throws Exception {
        Assert.assertThat("Matched mixed case String", false, is(validator.validate(INPUT, INPUT)));
    }

    @Test
    public void testValidateDoesNotMatchShorter() throws Exception {
        Assert.assertThat("Matched shorter result", false, is(validator.validate(INPUT, VALID_RESULT.substring(2))));
    }

    @Test
    public void testValidateDoesNotMatchLonger() throws Exception {
        Assert.assertThat("Matched longer result", false, is(validator.validate(INPUT, VALID_RESULT + VALID_RESULT)));
    }
}
