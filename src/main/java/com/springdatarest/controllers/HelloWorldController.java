package com.springdatarest.controllers;

import com.springdatarest.entities.Customer;
import com.springdatarest.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.springdatarest")
@EntityScan(basePackages = "com.springdatarest.entities")
public class HelloWorldController implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Autowired
    public HelloWorldController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class);
    }

    @Override
    public void run(String... args) throws Exception {
        this.customerRepository.save(new Customer("Ron", "Johnson"));
    }
}
