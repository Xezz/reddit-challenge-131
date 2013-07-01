package org.xezz.testchallenge;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 13:23
 */
public class InputTesterTest {

    @Test
    public void testTestDataReverse() throws Exception {
        Assert.assertThat("Valid reverse did not match", true, is(InputTester.testData(TestType.REVERSE, "Car", "raC")));
    }

    @Test
    public void testTestDataReverseDoesNotMatch() throws Exception {
        Assert.assertThat("Invalid reverse did match", false, is(InputTester.testData(TestType.REVERSE, "Alpha", "AhplA")));
    }

    @Test
    public void testTestDataUpper() throws Exception {
        Assert.assertThat("Valid upper case did not match", true, is(InputTester.testData(TestType.UPPERCASE, "Graph", "GRAPH")));
    }

    @Test
    public void testTestDataUpperDoesNotMatch() throws Exception {
        Assert.assertThat("Invalid upper case did match", false, is(InputTester.testData(TestType.UPPERCASE, "One", "one")));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTestDataThrowsExceptionWithNull() throws Exception {
        InputTester.testData(null, "", "");
    }
}
