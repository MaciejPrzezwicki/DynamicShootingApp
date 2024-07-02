package com.MaciejPrzezwicki.DynamicShootingApp.validation;

import jakarta.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;


public class LicenseNumberValidatorTest {
    LicenseNumberValidator v = new LicenseNumberValidator();
    @Mock
    ConstraintValidatorContext context;
    @Test
    void isNumberValid() {
        //Given
        String licenseNumber1 = "012345678912";
        String licenseNumber2 = "01a3456b8912";
        String licenseNumber3 = "0123456789";
        String licenseNumber4 = "012345678912345";

        //When
        boolean result1 = v.isValid(licenseNumber1, context);
        boolean result2 = v.isValid(licenseNumber2, context);
        boolean result3 = v.isValid(licenseNumber3, context);
        boolean result4 = v.isValid(licenseNumber4, context);

        //Then
        assertThat(result1)
                .isTrue();
        assertThat(result2)
                .isFalse();
        assertThat(result3)
                .isFalse();
        assertThat(result4)
                .isFalse();

    }
}
