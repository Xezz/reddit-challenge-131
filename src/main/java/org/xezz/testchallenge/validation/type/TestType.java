package org.xezz.testchallenge.validation.type;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:16
 */
public enum TestType {
    REVERSE(0), UPPERCASE(1), LOWERCASE(2);

    private final int type;

    /**
     * Construct a TestType
     *
     * @param testType internal value
     */
    private TestType(final int testType) {
        this.type = testType;
    }

    /**
     * Get a TestType by its int value
     *
     * @param type value to look for
     * @return TestType or null if none exists with that value
     */
    public static TestType getTypeByValue(final int type) {
        TestType resultType = null;
        for (TestType testType : values()) {
            if (testType.type == type) {
                resultType = testType;
                break;
            }
        }
        return resultType;
    }


}
