package com.MaciejPrzezwicki.DynamicShootingApp.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = LicenseNumberValidator.class)
public @interface LicenseNumber {

    String message() default "This field can only consist of 12 digits";

    Class<?>[] groups() default {
    };

    Class<? extends Payload>[] payload() default {
    };
}