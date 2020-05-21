package com.example.whiskyshop.whiskyservice.controllers;

import com.example.whiskyshop.whiskyservice.models.Customer;
import com.example.whiskyshop.whiskyservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value= "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/login")
    public ResponseEntity findByUserNameAndPassword(
            @RequestParam(name = "userName") String userName,
            @RequestParam(name = "password") String password){
        return new ResponseEntity(customerRepository.findByUserNameAndPassword(userName,password), HttpStatus.OK);
    }

    @PostMapping(value = "/customers")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Long id){
        Customer found = customerRepository.getOne(id);
        customerRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
