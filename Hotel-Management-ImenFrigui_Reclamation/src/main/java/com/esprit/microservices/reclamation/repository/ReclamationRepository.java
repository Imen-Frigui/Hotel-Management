package com.esprit.microservices.reclamation.repository;

import com.esprit.microservices.reclamation.entity.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReclamationRepository extends JpaRepository<Reclamation,Integer> {



}
