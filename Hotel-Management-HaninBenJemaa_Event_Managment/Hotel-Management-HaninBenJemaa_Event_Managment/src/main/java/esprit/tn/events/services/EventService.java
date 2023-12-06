package esprit.tn.events.services;

import esprit.tn.events.entities.Event;
import esprit.tn.events.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event addEvent(Event event){
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

}
