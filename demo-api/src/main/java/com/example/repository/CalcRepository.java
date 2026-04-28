package com.example.repository;

import com.example.model.Calculation; // Import your entity
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalcRepository extends JpaRepository<Calculation, Long> {
}


