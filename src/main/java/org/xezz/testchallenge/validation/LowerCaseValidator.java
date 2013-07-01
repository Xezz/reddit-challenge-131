package org.xezz.testchallenge.validation;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:54
 * Tests input on lower case equality
 */
public class LowerCaseValidator implements Validator {
    @Override
    public final boolean validate(final String input, final String result) {
        if (input == null || result == null) {
            throw new IllegalArgumentException("Null values not allowed!");
        }
        return result.equals(input.toLowerCase());
    }
}
