package org.xezz.testchallenge.tester;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:40
 */
public class ReverseTester implements Testable {
    @Override
    public final boolean testInput(String input, String result) {
        if (input == null || result == null) {
            throw new IllegalArgumentException("Null values not allowed!");
        }
        return result.equals(new StringBuilder(input).reverse().toString());
    }
}
