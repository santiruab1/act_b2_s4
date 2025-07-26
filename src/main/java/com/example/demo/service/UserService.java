package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

public class UserService {
    @Repository
    public interface  UserRepository extends JpaRepository<User, Long> {
        List<User> findByNameContainingIgnoreCase(String name);
        List<User> findByEmailContainingIgnoreCase(String email);
        boolean exiexistsByEmail(String email);        
    }

}
