package esprit.tn.events.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEv;
    private String eventName;
    private String description;

    private LocalDate date;
    private LocalTime time;
    private String eventStatus;
    @Column(length = 255)
    private String location;
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    @OneToOne
    private Employee employee;
    public Event() {
    }


}
