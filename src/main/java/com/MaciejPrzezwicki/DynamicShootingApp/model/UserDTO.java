package com.MaciejPrzezwicki.DynamicShootingApp.model;

import com.MaciejPrzezwicki.DynamicShootingApp.validation.LicenseNumber;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @NotBlank(message = "name field can't be blank")
    private String name;
    @NotBlank(message = "surname field can't be blank")
    private String surname;
    @LicenseNumber (message = "License number must contains only 12 digits")
    private String licenseNumber;
    @NotBlank
    private String emailAddress;
    @NotBlank
    private String role;
}
