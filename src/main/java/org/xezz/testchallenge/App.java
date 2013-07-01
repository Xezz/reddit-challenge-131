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
            if (InputTester.testData(TestType.getTypeByValue(scanner.nextInt()), scanner.next(), scanner.next())) {
                System.out.println("Good test data");
            } else {
                System.out.println("Mismatch! Bad test data");
            }
        }
    }

}
