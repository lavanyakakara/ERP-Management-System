package com.example.erp_managment_system.service;

import com.example.erp_managment_system.entity.User;
import com.example.erp_managment_system.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private Userrepository userRepository;
    // Create User
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User login(String email) {
        return userRepository.findByEmail(email);
    }
    public long getUserCount() {
        return userRepository.count();
    }
    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    // Update User
    // Update User
    public User updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setRole(updatedUser.getRole());
        return userRepository.save(existingUser);
    }
    // Delete User
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
