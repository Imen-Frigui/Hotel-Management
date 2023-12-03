package tn.esprit.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation ,Long> {
}
