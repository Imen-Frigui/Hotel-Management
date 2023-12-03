package tn.esprit.reservation.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.reservation.entities.Reservation;
import tn.esprit.reservation.services.Ireservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/resv")
public class ReservationController {
private Ireservation ires;


    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation b){
        return ires.addReservation(b);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation b){
        return ires.updateReservation(b);

    }


    @GetMapping("/getAll")
    public List<Reservation> getAllReservation(){
        return ires.getAllReservation();
    }

    @GetMapping("/get/{id}")
    public Reservation getById( @PathVariable long id){
        return ires.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable long id){
        ires.deleteReservation(id);
    }
}
