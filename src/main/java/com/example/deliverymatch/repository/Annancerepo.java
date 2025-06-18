package com.example.deliverymatch.repository;

import com.example.deliverymatch.models.Annance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Annancerepo extends JpaRepository<Annance,Long> {

}
