package com.restfulservices.restfulapi;

import com.restfulservices.restfulapi.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Criteria;

import javax.management.Query;

@SpringBootApplication
public class RestfulapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulapiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {
			String name = "Sanket";
			Product product = new Product("Sanket","12345","Java","SpringBoot");
			repository.findProductByName(name).ifPresentOrElse(s -> {
				System.out.println(s + " already exists");
			}, ()->{
				System.out.println("Inserting data " + product);
				repository.insert(product);
			});
		};
	}
}
