package org.xezz.testchallenge.tester;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:33
 */
public interface Testable {
    /**
     * Test if input and result are valid
     *
     * @param input  String to transform
     * @param result transformed String
     * @return true if the result is valid for the input
     */
    boolean testInput(final String input, final String result);
}
