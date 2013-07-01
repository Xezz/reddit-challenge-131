package org.xezz.testchallenge.validation;

import org.xezz.testchallenge.TestType;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:34
 * Builds Validator depending on the TestType
 */
public final class ValidatorBuilder {
    /**
     * Builds a suited implementation of Validator
     *
     * @param type that the Validator has to support
     * @return fitting Validator to the TestType
     * @throws UnsupportedOperationException if there is no fitting implementation available
     */
    public static Validator buildValidator(TestType type) throws UnsupportedOperationException {
        if (type == null) {
            throw new UnsupportedOperationException("No implementation found for null value!");
        }
        switch (type) {
            case REVERSE:
                return new ReverseValidator();
            case UPPERCASE:
                return new UpperCaseValidator();
            case LOWERCASE:
                return new LowerCaseValidator();
            default:
                throw new UnsupportedOperationException("No implementation know for TestType: " + type.name());
        }
    }

    /**
     * No instantiation allowed!
     */
    private ValidatorBuilder() {
    }
}
