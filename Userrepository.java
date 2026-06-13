package com.example.erp_managment_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erp_managment_system.entity.User;
public interface Userrepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    long count();
}
