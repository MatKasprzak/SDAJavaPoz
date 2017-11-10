package com.sda.planer.planer.Services;

import com.sda.planer.planer.model.Room;
import com.sda.planer.planer.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getAllRooms(){
        return (List<Room>) roomRepository.findAll();
    }
    public Room getRoom(long id){
        return roomRepository.findOne(id);
    }
    public int saveRoom(Room room){
        return (int) roomRepository.save(room).getId();
    }
}
