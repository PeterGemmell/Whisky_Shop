package com.example.whiskyshop.whiskyservice.repositories;

import com.example.whiskyshop.whiskyservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long> {

    Customer findByUserNameAndPassword(String userName, String password);
}
