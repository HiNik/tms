package by.tms.service;

import by.tms.entity.Hotel;
import by.tms.entity.Room;
import by.tms.repository.AL.Hotels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HotelService {
    private final Hotels hotels;

    public HotelService(Hotels hotels) {
        this.hotels = hotels;
    }

    public void addHotel(Hotel hotel){hotels.addHotel(hotel);}

    public ArrayList<Hotel> getAllHotels(){return hotels.getAllHotels();}
    public ArrayList<Room> getAllRooms(Hotel hotel){return hotels.getAllRooms(hotel);}

    public void addRoom( Room room){
        hotels.addRoom(room);
    }

    public Hotel getHotelByName(String name){ return hotels.getHotelByName(name);}
}
