package com.MaciejPrzezwicki.DynamicShootingApp.service;

import com.MaciejPrzezwicki.DynamicShootingApp.model.User;
import com.MaciejPrzezwicki.DynamicShootingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(String name, String surname, String licenseNumber, String emailAddress, String role) {
        User user = User.builder()
                .name(name)
                .surname(surname)
                .licenseNumber(licenseNumber)
                .emailAddress(emailAddress)
                .role(role)
                .build();


        return userRepository.addUser(user);
    }

    public List<User> findUser(String sortBy) {
        return userRepository.findUser(sortBy);
    }
}

