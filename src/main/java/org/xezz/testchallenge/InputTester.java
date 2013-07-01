package org.xezz.testchallenge;

import org.xezz.testchallenge.tester.TesterBuilder;

/**
 * Test a given input and the expected result on validity
 */
public final class InputTester {
    public static boolean testData(final TestType testType, final String input, final String result) {
        return TesterBuilder.buildTester(testType).testInput(input, result);
    }
}