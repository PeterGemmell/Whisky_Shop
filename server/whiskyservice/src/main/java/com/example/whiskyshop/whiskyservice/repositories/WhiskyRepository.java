package com.example.whiskyshop.whiskyservice.repositories;

import com.example.whiskyshop.whiskyservice.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
}
