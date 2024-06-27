package com.MaciejPrzezwicki.DynamicShootingApp.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "competitors")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "license_number")
    private String licenseNumber;
    @Column(name = "e-mail")
    private String emailAddress;
    @Column(name = "role")
    private String role;

}
