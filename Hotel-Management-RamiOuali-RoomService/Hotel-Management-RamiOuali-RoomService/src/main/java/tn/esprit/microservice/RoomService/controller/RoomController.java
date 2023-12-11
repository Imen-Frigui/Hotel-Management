package tn.esprit.microservice.RoomService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.microservice.RoomService.entities.Room;
import tn.esprit.microservice.RoomService.entities.RoomStatus;
import tn.esprit.microservice.RoomService.service.RoomService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getAll")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    public Optional<Room> getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }


    @PostMapping("/add")
    public Room saveRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }


    @PutMapping("/UpdateRoom/{Id}/{status}")
    public Room UpdateRoombyID(@PathVariable long Id, @PathVariable RoomStatus status) {
        return roomService.UpdateRoombyID(Id, status);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}