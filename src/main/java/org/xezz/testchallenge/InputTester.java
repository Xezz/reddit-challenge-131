package org.xezz.testchallenge;

import org.xezz.testchallenge.validation.ValidatorBuilder;

/**
 * Test a given input and the expected result on validity
 */
public final class InputTester {
    /**
     * Test input on validity depending on the type of the test
     *
     * @param testType operation to test for
     * @param input    String to transform
     * @param result   result of the transformation
     * @return true when the result is correct for the input and the TestType
     * @throws UnsupportedOperationException if no implementation for the TestType is available
     */
    public static boolean testData(final TestType testType, final String input, final String result) throws UnsupportedOperationException {
        return ValidatorBuilder.buildValidator(testType).validate(input, result);
    }

    /**
     * Do not allow to create an instance of this utility class
     */
    private InputTester() {
    }
}