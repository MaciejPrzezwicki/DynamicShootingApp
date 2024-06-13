package com.MaciejPrzezwicki.DynamicShootingApp.model;

import com.MaciejPrzezwicki.DynamicShootingApp.validation.LicenseNumber;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserDTO {
    private int userId;
    @NotBlank(message = "name field can't be blank")
    private String name;
    @NotBlank(message = "surname field can't be blank")
    private String surname;
    @LicenseNumber (message = "License number must contains only 12 digits")
    private int licenseNumber;
    private String emailAddress;
    private String role;
}
