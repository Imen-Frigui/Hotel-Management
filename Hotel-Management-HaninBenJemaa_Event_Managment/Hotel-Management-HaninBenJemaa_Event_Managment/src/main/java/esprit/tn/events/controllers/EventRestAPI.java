package esprit.tn.events.controllers;

import esprit.tn.events.entities.Event;
import esprit.tn.events.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Event")
public class EventRestAPI {

    @Autowired
    private EventService eventService;
    @GetMapping(value = "/allEvents", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Event>> getEvents(){
        return new ResponseEntity<>(eventService.getAllEvents(),HttpStatus.OK);
    }
    @PostMapping(value ="/addEvent" , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Event> createReclamation(@RequestBody Event event) {
        return new ResponseEntity<>(eventService.addEvent(event), HttpStatus.OK);
    }
    @PutMapping(value = "/updateEvent/{idEv}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Event> updateEvent(@PathVariable(value = "idEv") int idEv,  @RequestBody Event event){  return new ResponseEntity<>(eventService.updateEvent(idEv, event),  HttpStatus.OK);
    }
    @DeleteMapping(value = "/deleteEvent/{idEv}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteEvent(@PathVariable(value = "idEv") int idEv){  return new ResponseEntity<>(eventService.deleteEvent(idEv), HttpStatus.OK); }

}
