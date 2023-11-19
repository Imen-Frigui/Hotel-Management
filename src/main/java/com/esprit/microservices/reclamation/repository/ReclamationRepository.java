package com.esprit.microservices.reclamation.repository;

import com.esprit.microservices.reclamation.entity.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepository extends JpaRepository<Reclamation,Integer> {
}
