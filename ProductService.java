package com.example.erp_managment_system.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.erp_managment_system.entity.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public long getProductCount() {
        return productRepository.count();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

// Local repository interface to resolve missing import from repository package
interface ProductRepository extends JpaRepository<Product, Long> {
}
