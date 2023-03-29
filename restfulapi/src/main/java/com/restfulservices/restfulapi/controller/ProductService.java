package com.restfulservices.restfulapi.controller;

import com.restfulservices.restfulapi.UserRepository;
import com.restfulservices.restfulapi.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private final UserRepository repository;
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
