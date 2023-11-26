package com.example.hotelemployeemanagement.Repositories;

import com.example.hotelemployeemanagement.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
