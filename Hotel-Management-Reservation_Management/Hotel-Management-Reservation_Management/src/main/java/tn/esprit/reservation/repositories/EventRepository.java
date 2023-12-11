package tn.esprit.reservation.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.reservation.entities.Event;

public interface EventRepository extends JpaRepository<Event,Integer> {
}

