package org.xezz.testchallenge;

import java.util.Scanner;

/**
 * Solution to the Reddit Challange 131
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            if (testData(scanner.nextInt(), scanner.next(), scanner.next())) {
                System.out.println("Good test data");
            } else {
                System.out.println("Mismatch! Bad test data");
            }
        }
    }

    public static boolean testData(final int testType, final String input, final String result) {
        if (testType == 0) {
            return testReverseString(input, result);
        } else if (testType == 1) {
            return testUpperCaseString(input, result);
        } else {
            throw new IllegalArgumentException("Unknown test type");
        }
    }

    private static boolean testReverseString(final String input, final String result) {
        return result.equals(new StringBuilder(input).reverse().toString());
    }

    private static boolean testUpperCaseString(final String input, final String result) {
        return result.equals(input.toUpperCase());
    }
}
