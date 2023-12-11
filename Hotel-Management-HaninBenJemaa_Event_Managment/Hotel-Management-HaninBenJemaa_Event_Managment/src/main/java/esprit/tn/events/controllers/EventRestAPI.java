package esprit.tn.events.controllers;

import esprit.tn.events.entities.Employee;
import esprit.tn.events.entities.Event;
import esprit.tn.events.repositories.EventRepository;
import esprit.tn.events.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Event")
public class EventRestAPI {

    @Autowired
    private EventService eventService;
    @Autowired
    private EventRepository eventRepository;
    private RestTemplate restTemplate;
    @GetMapping(value = "/allEvents", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Event>> getEvents(){
        return new ResponseEntity<>(eventService.getAllEvents(),HttpStatus.OK);
    }
    @PostMapping(value ="/addEvent/{id}" , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Event> createReclamation(@RequestBody Event event, @PathVariable long id) {

        return new ResponseEntity<>(eventService.addEvent(event,id), HttpStatus.OK);
    }
    @PutMapping(value = "/updateEvent/{idEv}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Event> updateEvent(@PathVariable(value = "idEv") int idEv,  @RequestBody Event event){  return new ResponseEntity<>(eventService.updateEvent(idEv, event),  HttpStatus.OK);
    }
    @DeleteMapping(value = "/deleteEvent/{idEv}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteEvent(@PathVariable(value = "idEv") int idEv){  return new ResponseEntity<>(eventService.deleteEvent(idEv), HttpStatus.OK); }

    @GetMapping(value = "/eventByEmp/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Event> getEvents(@PathVariable long id){
        return new ResponseEntity<>(eventService.getEventsByEmmployee(id),HttpStatus.OK);
    }
    @GetMapping(value = "/eventBy/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Event> getEventsByid(@PathVariable int id){
        return new ResponseEntity<>(eventRepository.findById(id).orElse(null),HttpStatus.OK);
    }


}
