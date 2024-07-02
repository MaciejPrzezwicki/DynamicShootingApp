package com.MaciejPrzezwicki.DynamicShootingApp.repository;

import com.MaciejPrzezwicki.DynamicShootingApp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User addUser(User user) {
        entityManager.persist(user);
        return user;
    }

    public List<User> findUser(String sortBy){
        if("id".equals(sortBy)){
            return entityManager.createQuery("FROM User", User.class).getResultList().stream().sorted(Comparator.comparing(User::getUserId)).collect(Collectors.toList());
        } else if("surname".equals(sortBy)){
            return entityManager.createQuery("FROM User", User.class).getResultList().stream().sorted(Comparator.comparing(User::getSurname)).collect(Collectors.toList());
        } else if ("licenseNumber".equals((sortBy))) {
            return entityManager.createQuery("FROM User", User.class).getResultList().stream().sorted(Comparator.comparing(User::getLicenseNumber)).collect(Collectors.toList());
        } else {
            return entityManager.createQuery("FROM User", User.class).getResultList();
        }
    }




}
