package tn.esprit.reservation.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tn.esprit.reservation.entities.Employee;
import tn.esprit.reservation.entities.Event;
import tn.esprit.reservation.entities.Reservation;
import tn.esprit.reservation.repositories.EventRepository;
import tn.esprit.reservation.repositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImp implements Ireservation{

    @Autowired
    private ReservationRepository repo ;
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private RestTemplate restTemplate;
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


    public Reservation reserveEvent(Reservation b, int id) {
        Event event1 = restTemplate.getForObject("http://localhost:8086/Event/eventBy/"+id, Event.class);
        eventRepository.save(event1);
        b.setEvent(event1);
        return repo.save(b);
    }
}
