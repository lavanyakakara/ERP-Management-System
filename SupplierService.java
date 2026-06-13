package com.example.erp_managment_system.service;
import com.example.erp_managment_system.entity.Supplier;
import com.example.erp_managment_system.repository.Supplierrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SupplierService {
    @Autowired
    private Supplierrepository supplierrepository;

    public Supplier saveSupplier(Supplier supplier){
        return supplierrepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers(){
        return supplierrepository.findAll();
    }

    public void deleteSupplier(Long id){
        supplierrepository.deleteById(id);
    }

    public long getSupplierCount(){
        return supplierrepository.count();
    }
}

