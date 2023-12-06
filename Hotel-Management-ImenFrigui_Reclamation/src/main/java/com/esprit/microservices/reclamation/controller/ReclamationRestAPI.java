package com.esprit.microservices.reclamation.controller;

import com.esprit.microservices.reclamation.entity.Reclamation;
import com.esprit.microservices.reclamation.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reclamation")
public class ReclamationRestAPI {
    @Autowired
    private ReclamationService reclamationService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Reclamation>> getReclmations(){
        return new ResponseEntity<>(reclamationService.getAllReclamations(),HttpStatus.OK);
    }
    @GetMapping(value = "/allUser", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Reclamation>> getReclamationsWithUser() {
        return new ResponseEntity<>(reclamationService.getAllReclamationsWithUser(), HttpStatus.OK);
    }

    @PostMapping(value ="/add/{userID}" , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation, @PathVariable Long userID) {
        return new ResponseEntity<>(reclamationService.addReclamation(reclamation, userID), HttpStatus.OK);
    }
    @PutMapping(value = "/update/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reclamation> updateReclamation(@PathVariable(value = "id") int id,  @RequestBody Reclamation reclamation){  return new ResponseEntity<>(reclamationService.update(id, reclamation),  HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteReclamation(@PathVariable(value = "id") int id){  return new ResponseEntity<>(reclamationService.delete(id), HttpStatus.OK); }

    @PostMapping("/accept/{id}")
    public ResponseEntity<Reclamation> acceptReclamation(@PathVariable int id) {
        return new ResponseEntity<>(reclamationService.acceptReclamation(id), HttpStatus.OK);
    }

    @PostMapping("/reject/{id}")
    public ResponseEntity<Reclamation> rejectReclamation(@PathVariable int id) {
        return new ResponseEntity<>(reclamationService.rejectReclamation(id), HttpStatus.OK);
    }

}
