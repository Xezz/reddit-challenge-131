package org.xezz.testchallenge;

import org.junit.Assert;
import org.junit.Test;
import org.xezz.testchallenge.validation.InputValidator;
import org.xezz.testchallenge.validation.type.TestType;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 13:23
 */
public class InputValidatorTest {

    @Test
    public void testTestDataReverse() throws Exception {
        Assert.assertThat("Valid reverse did not match", true, is(InputValidator.validateData(TestType.REVERSE, "Car", "raC")));
    }

    @Test
    public void testTestDataReverseDoesNotMatch() throws Exception {
        Assert.assertThat("Invalid reverse did match", false, is(InputValidator.validateData(TestType.REVERSE, "Alpha", "AhplA")));
    }

    @Test
    public void testTestDataUpper() throws Exception {
        Assert.assertThat("Valid upper case did not match", true, is(InputValidator.validateData(TestType.UPPERCASE, "Graph", "GRAPH")));
    }

    @Test
    public void testTestDataUpperDoesNotMatch() throws Exception {
        Assert.assertThat("Invalid upper case did match", false, is(InputValidator.validateData(TestType.UPPERCASE, "One", "one")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTestDataThrowsExceptionWithNull() throws Exception {
        InputValidator.validateData(null, "", "");
    }
}
