package org.xezz.testchallenge.validation;

import org.junit.Assert;
import org.junit.Test;
import org.xezz.testchallenge.validation.impl.LowerCaseValidator;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 12:12
 */
public class LowerCaseValidatorTest {
    private static final String INPUT = "AxFgHHBB";
    private static final String VALID_RESULT = INPUT.toLowerCase();
    private final LowerCaseValidator validator = new LowerCaseValidator();

    @Test
    public void testValidate() throws Exception {
        Assert.assertThat("Tester did not match on valid inputs", true, is(validator.validate(INPUT, VALID_RESULT)));
    }

    @Test
    public void testValidateWithUpperCase() throws Exception {
        Assert.assertThat("Tester did match on invalid result", false, is(validator.validate(INPUT, INPUT.toUpperCase())));
    }

    @Test
    public void testValidateWithMixedCase() throws Exception {
        Assert.assertThat("Tester did match on mixed case", false, is(validator.validate(INPUT, INPUT)));
    }

    @Test
    public void testValidateWithShorterLength() throws Exception {
        Assert.assertThat("Tester did match on different length Strings (shorter)", false, is(validator.validate(INPUT, INPUT.substring(2).toLowerCase())));
    }

    @Test
    public void testValidateWithLongerLength() throws Exception {
        final String result = (INPUT + INPUT).toLowerCase();
        Assert.assertThat("Tester did match on different length Strings (longer)", false, is(validator.validate(INPUT, result)));
    }
}
