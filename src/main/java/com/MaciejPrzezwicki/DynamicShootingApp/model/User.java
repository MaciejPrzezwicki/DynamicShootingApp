package com.MaciejPrzezwicki.DynamicShootingApp.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Builder
@ToString
public class User {

    private int userId;
    private String name;
    private String surname;
    private String licenseNumber;
    private String emailAddress;
    private String role;

}
