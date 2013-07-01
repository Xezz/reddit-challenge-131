package org.xezz.testchallenge.validation;

import org.xezz.testchallenge.validation.impl.LowerCaseValidator;
import org.xezz.testchallenge.validation.impl.ReverseValidator;
import org.xezz.testchallenge.validation.impl.UpperCaseValidator;
import org.xezz.testchallenge.validation.type.TestType;

/**
 * User: Xezz
 * Date: 01.07.13
 * Time: 11:34
 * Builds Validator depending on the TestType
 */
public final class ValidatorBuilder {
    /**
     * No instantiation allowed!
     */
    private ValidatorBuilder() {
    }

    /**
     * Builds a suited implementation of Validator
     *
     * @param type that the Validator has to support
     * @return fitting Validator to the TestType
     * @throws UnsupportedOperationException if there is no fitting implementation available
     */
    public static Validator buildValidator(final TestType type) throws UnsupportedOperationException {
        if (type == null) {
            throw new UnsupportedOperationException("No implementation found for null value!");
        }
        Validator resultValidator;
        switch (type) {
            case REVERSE:
                resultValidator = new ReverseValidator();
                break;
            case UPPERCASE:
                resultValidator = new UpperCaseValidator();
                break;
            case LOWERCASE:
                resultValidator = new LowerCaseValidator();
                break;
            default:
                throw new UnsupportedOperationException("No implementation know for TestType: " + type.name());
        }
        return resultValidator;
    }


}
