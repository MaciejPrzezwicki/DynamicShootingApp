package com.MaciejPrzezwicki.DynamicShootingApp.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class LicenseNumberValidator implements ConstraintValidator<LicenseNumber, String> {
    @Override
    public void initialize(final LicenseNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value != "\\d{12}";
    }

}
