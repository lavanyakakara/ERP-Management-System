package com.example.erp_managment_system.repository;
import com.example.erp_managment_system.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Inventoryrepository
        extends JpaRepository<Inventory, Long> {
}
