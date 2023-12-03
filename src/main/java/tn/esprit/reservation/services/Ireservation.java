package tn.esprit.reservation.services;

import tn.esprit.reservation.entities.Reservation;

import java.util.List;

public interface Ireservation {
    public Reservation addReservation (Reservation b ) ;
    public Reservation  updateReservation(Reservation b );
    public List<Reservation> getAllReservation();
    public Reservation getById(long id );
    public void deleteReservation (long id );
}
