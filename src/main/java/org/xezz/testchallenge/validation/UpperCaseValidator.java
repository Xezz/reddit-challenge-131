package org.xezz.testchallenge.validation;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:41
 */
public class UpperCaseValidator implements Validator {
    @Override
    public final boolean validate(final String input, final String result) {
        if (input == null || result == null) {
            throw new IllegalArgumentException("Null values not allowed!");
        }
        return result.equals(input.toUpperCase());
    }
}
