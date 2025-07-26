package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> findByName(String name);

    List<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
