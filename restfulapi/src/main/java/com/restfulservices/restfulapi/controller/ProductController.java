package com.restfulservices.restfulapi.controller;

import com.restfulservices.restfulapi.UserRepository;
import com.restfulservices.restfulapi.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private UserRepository userRepository;
    @GetMapping("/")
    public List<Product> fetchAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product fetchAllProducts(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }
    @PostMapping("/")
    public Product postMethodName(@RequestBody Product product) {
        return userRepository.save(product);
    }
    @PutMapping("/")
    public Product PutMapping(@RequestBody Product newProduct) {
        Product oldProduct = userRepository.findById(newProduct.getId()).orElse(null);
        oldProduct.setName(newProduct.getName());
        oldProduct.setId(newProduct.getId());
        oldProduct.setLanguage(newProduct.getLanguage());
        oldProduct.setFramework(newProduct.getFramework());
        return oldProduct;
    }
    @DeleteMapping("/{id}")
    public String DeleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return id;
    }
}
