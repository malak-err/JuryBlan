package com.example.deliverymatch.repository;

import com.example.deliverymatch.models.Demmande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemmandeRepo extends JpaRepository<Demmande,Long> {
}
