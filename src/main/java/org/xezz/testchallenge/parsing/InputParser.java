package org.xezz.testchallenge.parsing;

import org.xezz.testchallenge.validation.InputValidator;
import org.xezz.testchallenge.validation.type.TestType;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 13:38
 */
public final class InputParser {
    /**
     * Do not allow any instance of this class to be created
     */
    private InputParser() {
    }

    /**
     * Reads input and writes the result to the output
     *
     * @param inputStream  input to be read from
     * @param outputStream output to write to
     */
    public static void handleInput(final InputStream inputStream, final PrintStream outputStream) {
        final Scanner scanner = new Scanner(inputStream);
        final int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            if (InputValidator.validateData(TestType.getTypeByValue(scanner.nextInt()), scanner.next(), scanner.next())) {
                outputStream.println("Good test data");
            } else {
                outputStream.println("Mismatch! Bad test data");
            }
        }
    }
}
