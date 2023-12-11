package esprit.tn.events.services;

import esprit.tn.events.entities.Employee;
import esprit.tn.events.entities.Event;
import esprit.tn.events.repositories.EmployeeRepository;
import esprit.tn.events.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService {

    private EventRepository eventRepository;
    private EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate = new RestTemplate();


    public Event addEvent(Event event, long id){
        Employee employee = restTemplate.getForObject("http://localhost:8089/employee/get/"+id, Employee.class);
        employeeRepository.save(employee);
        event.setEmployee(employee);
        return eventRepository.save(event);
    }
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
    public Event updateEvent(int idEv,Event newEvent){
        if (eventRepository.findById(idEv).isPresent()) {
            Event existingEvent = eventRepository.findById(idEv).get();
            existingEvent.setEventName(newEvent.getEventName());
            existingEvent.setDescription(newEvent.getDescription());
            existingEvent.setDate(newEvent.getDate());
            existingEvent.setTime(newEvent.getTime());
            existingEvent.setEventStatus(newEvent.getEventStatus());
            existingEvent.setLocation(newEvent.getLocation());
            return eventRepository.save( existingEvent);
        } else
            return null;
    }
    public String deleteEvent(int idEv) {
        if (eventRepository.findById(idEv).isPresent()) {
            eventRepository.deleteById(idEv);
            return "event deleted";
        } else
            return "event not deleted";
    }

    public Event getEventsByEmmployee (long id){
        Employee employee = employeeRepository.findById(id).orElse(null);
        return eventRepository.findEventByEmployee(employee);
    }

}
