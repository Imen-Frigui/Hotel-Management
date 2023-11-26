package esprit.tn.events.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
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

    public Event() {
    }

    public Event(String eventName, String description, LocalDate date, LocalTime  time, String eventStatus, String location) {
        this.eventName = eventName;
        this.description = description;
        this.date = date;
        this.time = time;
        this.eventStatus = eventStatus;
        this.location = location;
    }

    public int getIdEv() {
        return idEv;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setIdEv(int idEv) {
        this.idEv = idEv;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "idEv=" + idEv +
                ", eventName='" + eventName + '\'' +
                ", decription='" + description + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", eventStatus='" + eventStatus + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
