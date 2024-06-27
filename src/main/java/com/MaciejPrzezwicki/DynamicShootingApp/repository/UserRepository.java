package com.MaciejPrzezwicki.DynamicShootingApp.repository;

import com.MaciejPrzezwicki.DynamicShootingApp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User addUser(User user) {
        entityManager.persist(user);
        return user;
    }

    public List<User> getUsers() {
        return entityManager.createQuery("FROM Users", User.class).getResultList();
    }


}
