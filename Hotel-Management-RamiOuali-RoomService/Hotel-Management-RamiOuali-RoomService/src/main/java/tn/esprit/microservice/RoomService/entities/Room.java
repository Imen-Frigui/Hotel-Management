package tn.esprit.microservice.RoomService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@AllArgsConstructor
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeRoom Type;
    @Enumerated(EnumType.STRING)
    private RoomStatus status;
    private int clientId;

    public Room() {

    }
}