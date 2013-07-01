package org.xezz.testchallenge.validation;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 12:12
 */
public class LowerCaseValidatorTest {
    final static private LowerCaseValidator testee = new LowerCaseValidator();
    final static private String INPUT = "AxFgHHBB";
    final static private String VALID_RESULT = INPUT.toLowerCase();

    @Test
    public void testTestInput() throws Exception {
        Assert.assertThat("Tester did not match on valid inputs", true, is(testee.validate(INPUT, VALID_RESULT)));
    }

    @Test
    public void testTestInputWithUpperCase() throws Exception {
        Assert.assertThat("Tester did match on invalid result", false, is(testee.validate(INPUT, INPUT.toUpperCase())));
    }

    @Test
    public void testTestInputWithMixedCase() throws Exception {
        Assert.assertThat("Tester did match on mixed case", false, is(testee.validate(INPUT, INPUT)));
    }

    @Test
    public void testTestInputWithShorterLength() throws Exception {
        Assert.assertThat("Tester did match on different length Strings (shorter)", false, is(testee.validate(INPUT, INPUT.substring(2).toLowerCase())));
    }

    @Test
    public void testTestInputWithLongerLength() throws Exception {
        Assert.assertThat("Tester did match on different length Strings (longer)", false, is(testee.validate(INPUT, (INPUT + INPUT).toLowerCase())));
    }
}
