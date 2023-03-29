package com.restfulservices.restfulapi;

import com.restfulservices.restfulapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<Product, String> {
    Optional<Product> findProductByName(String name);
}
