package org.xezz.testchallenge.tester;

import org.xezz.testchallenge.TestType;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:34
 * Builds Testable depending on the TestType
 */
public final class TesterBuilder {
    /**
     * Builds a suited implementation of Testable
     *
     * @param type that the Testable has to support
     * @return fitting Testable to the TestType
     * @throws UnsupportedOperationException if there is no fitting implementation available
     */
    public static Testable buildTester(TestType type) throws UnsupportedOperationException {
        switch (type) {
            case REVERSE:
                return new ReverseTester();
            case UPPERCASE:
                return new UpperCaseTester();
            case LOWERCASE:
                return new LowerCaseTester();
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
