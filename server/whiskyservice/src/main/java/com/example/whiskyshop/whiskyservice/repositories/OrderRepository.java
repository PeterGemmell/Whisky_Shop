package com.example.whiskyshop.whiskyservice.repositories;

import com.example.whiskyshop.whiskyservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
