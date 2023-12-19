package com.example.Folklore.services;

import com.example.Folklore.entities.User;
import com.example.Folklore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) { return userRepository.save(user); }
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public Optional<User> findById(Long id){ return userRepository.findById(id); }
    public List<User> findAll() {return userRepository.findAll(); }
    public void deleteUserById(Long id) { userRepository.deleteById(id); }

}
