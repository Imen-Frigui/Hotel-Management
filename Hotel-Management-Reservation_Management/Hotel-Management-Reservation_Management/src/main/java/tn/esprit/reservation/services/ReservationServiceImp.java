package tn.esprit.reservation.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.reservation.entities.Reservation;
import tn.esprit.reservation.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements Ireservation{

    private ReservationRepository repo ;
    @Override
    public Reservation addReservation(Reservation b) {
        return repo.save(b);
    }

    @Override
    public Reservation updateReservation(Reservation b) {
        return repo.save(b);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return repo.findAll();
    }

    @Override
    public Reservation getById(long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteReservation(long id) {
        repo.deleteById(id);
    }
}
