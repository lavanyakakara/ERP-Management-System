package com.example.erp_managment_system.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erp_managment_system.entity.Inventory;
import com.example.erp_managment_system.repository.Inventoryrepository;
@Service
public class InventoryService {
    @Autowired
    private Inventoryrepository repository;
    public Inventory saveInventory(Inventory inventory){
        return repository.save(inventory);
    }
    public List<Inventory> getAllInventory(){
        return repository.findAll();
    }
    public void deleteInventory(Long id){
        repository.deleteById(id);
    }
    public long getInventoryCount() {
    return repository.count();
}
}
