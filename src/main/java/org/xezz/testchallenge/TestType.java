package org.xezz.testchallenge;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:16
 */
public enum TestType {
    REVERSE(0), UPPERCASE(1), LOWERCASE(2);

    private final int type;

    private TestType(int i) {
        this.type = i;
    }

    public static TestType getTypeByValue(final int type) {
        for (TestType t : values()) {
            if (t.type == type) {
                return t;
            }
        }
        return null;
    }


}
