package tn.esprit.microservice.RoomService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.microservice.RoomService.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {


}