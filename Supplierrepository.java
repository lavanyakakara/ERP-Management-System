package com.example.erp_managment_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erp_managment_system.entity.Supplier;
public interface Supplierrepository
        extends JpaRepository<Supplier, Long> {
}
