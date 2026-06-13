package com.example.erp_managment_system.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp_managment_system.entity.Product;
import com.example.erp_managment_system.service.ProductService;
@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public Product createProduct(
            @RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {
        product.setProductId(id);
        return productService.saveProduct(product);
    }
    @GetMapping("/count")
    public long getProductCount() {
    return productService.getProductCount();
}
    @DeleteMapping("/{id}")
    public String deleteProduct(
            @PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}
