package com.example.erp_managment_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erp_managment_system.entity.Product;
public interface productrepository
        extends JpaRepository<Product, Long> {
}
