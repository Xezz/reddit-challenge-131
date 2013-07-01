package org.xezz.testchallenge;

import org.xezz.testchallenge.tester.TesterBuilder;

/**
 * Test a given input and the expected result on validity
 */
public class InputTester {
    public static boolean testData(final TestType testType, final String input, final String result) {
        return TesterBuilder.buildTester(testType).testInput(input, result);
    }

    static boolean testReverseString(final String input, final String result) {
        return result.equals(new StringBuilder(input).reverse().toString());
    }

    static boolean testUpperCaseString(final String input, final String result) {
        return result.equals(input.toUpperCase());
    }
}