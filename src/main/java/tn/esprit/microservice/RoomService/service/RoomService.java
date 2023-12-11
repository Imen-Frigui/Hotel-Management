package tn.esprit.microservice.RoomService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.microservice.RoomService.entities.Room;
import tn.esprit.microservice.RoomService.entities.RoomStatus;
import tn.esprit.microservice.RoomService.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }

    public Room UpdateRoombyID(long Id, RoomStatus status) {
      Room r =  roomRepository.findById(Id).orElse(null);
      r.setStatus(status);
    	return roomRepository.save(r);
    }
}