package org.xezz.testchallenge;

import org.xezz.testchallenge.parsing.InputParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Solution to the Reddit Challange 131
 */
public class App {
    public static void main(String[] args) {
        InputParser.handleInput(System.in, System.out);
        //readFromFile();
    }

    /**
     * Example how to use files as input/output
     */
    private static void readFromFile() {
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        final String workingDirectory = System.getProperty("user.dir");
        final String inputFileName = "text.txt";
        final String outputFileName = "result.txt";
        final Path path = Paths.get(workingDirectory);
        try {
            fileOutputStream = Files.newOutputStream(path.resolve(outputFileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
            fileInputStream = Files.newInputStream(path.resolve(inputFileName));
            if (fileInputStream != null && fileOutputStream != null) {
                InputParser.handleInput(fileInputStream, new PrintStream(fileOutputStream));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.err.println("Could not close Input stream");
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.err.println("Could not close Output stream");
                    e.printStackTrace();
                }
            }
        }
    }
}
