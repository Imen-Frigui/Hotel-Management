package esprit.tn.events.repositories;

import esprit.tn.events.entities.Employee;
import esprit.tn.events.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
    public Event findEventByEmployee(Employee employee);
}

