package org.xezz.testchallenge.validation;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:33
 */
public interface Validator {
    /**
     * Test if input and result are valid
     *
     * @param input  String to transform
     * @param result transformed String
     * @return true if the result is valid for the input
     */
    boolean validate(final String input, final String result);
}
