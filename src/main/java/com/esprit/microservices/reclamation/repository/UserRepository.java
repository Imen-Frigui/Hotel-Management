package com.esprit.microservices.reclamation.repository;

import com.esprit.microservices.reclamation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
