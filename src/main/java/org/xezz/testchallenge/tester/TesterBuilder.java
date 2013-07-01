package org.xezz.testchallenge.tester;

import org.xezz.testchallenge.TestType;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:34
 */
public final class TesterBuilder {
    public static Testable buildTester(TestType type) {
        switch (type) {
            case REVERSE:
                return new ReverseTester();
            case UPPERCASE:
                return new UpperCaseTester();
            case LOWERCASE:
                // return new LowerCaseTester();
            default:
                throw new UnsupportedOperationException("No implementation know for TestType: " + type.name());
        }
    }

    /**
     * No instantiation allowed!
     */
    private TesterBuilder() {
    }
}
