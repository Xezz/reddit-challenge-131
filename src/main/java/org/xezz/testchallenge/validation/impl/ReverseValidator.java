package org.xezz.testchallenge.validation.impl;

import org.xezz.testchallenge.validation.Validator;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:40
 */
public class ReverseValidator implements Validator {
    @Override
    public final boolean validate(final String input, final String result) {
        if (input == null || result == null) {
            throw new IllegalArgumentException("Null values not allowed!");
        }
        return result.equals(new StringBuilder(input).reverse().toString());
    }
}
