package org.xezz.testchallenge.tester;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:41
 */
public class UpperCaseTester implements Testable {
    @Override
    public boolean testInput(String input, String result) {
        if (input == null || result == null) {
            throw new IllegalArgumentException("Null values not allowed!");
        }
        return result.equals(input.toUpperCase());
    }
}
