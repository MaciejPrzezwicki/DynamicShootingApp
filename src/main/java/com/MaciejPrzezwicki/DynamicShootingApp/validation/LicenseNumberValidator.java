package com.MaciejPrzezwicki.DynamicShootingApp.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class LicenseNumberValidator implements ConstraintValidator<LicenseNumber, String> {

    @Override
    public void initialize(final LicenseNumber constraintAnnotation) {
    }

/*@Override
public boolean isValid(final String value, final ConstraintValidatorContext context) {
    return false;
}*/

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        boolean isValid = true;
        if (value.length() != 12) {
            isValid = false;
        } else {
            for (int i = 0; i < 12; i++) {
                if (!Character.isDigit(value.charAt(i))) {
                    isValid = false;

                }
            }
        }

        return isValid;
    }

}
