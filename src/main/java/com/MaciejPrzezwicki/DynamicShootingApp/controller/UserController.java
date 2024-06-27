package com.MaciejPrzezwicki.DynamicShootingApp.controller;

import com.MaciejPrzezwicki.DynamicShootingApp.model.User;
import com.MaciejPrzezwicki.DynamicShootingApp.model.UserDTO;
import com.MaciejPrzezwicki.DynamicShootingApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createCompetitor")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return asDto(
        userService.addUser(userDTO.getName(), userDTO.getSurname(), userDTO.getLicenseNumber(), userDTO.getEmailAddress(), userDTO.getRole())
        );
    }

    @GetMapping("/competitors")
    public List<UserDTO> getUsers(){
        return userService.getUsers().stream().map(this::asDto).collect(Collectors.toList());
    }



    public UserDTO asDto(User user) {
        return UserDTO.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .surname(user.getSurname())
                .licenseNumber(user.getLicenseNumber())
                .emailAddress(user.getEmailAddress())
                .role(user.getRole())
                .build();
    }
}
