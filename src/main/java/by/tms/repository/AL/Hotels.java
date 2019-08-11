package by.tms.repository.AL;

import by.tms.entity.Hotel;
import by.tms.entity.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Hotels {
    private static ArrayList<Hotel> hotels=new ArrayList<>();

    public void addHotel(Hotel hotel){hotels.add(hotel);}



    public void addRoom( Room room){
        Hotel hotel =getHotel(room.getHotel());
        ArrayList<Room> rooms=hotel.getRooms();
        rooms.add(room);
        hotel.setRooms(rooms);
    }


    public ArrayList<Hotel> getAllHotels(){ return hotels;}

    private Hotel getHotel(String name){
        for(Hotel hotel:hotels){
            if(hotel.getHotelName().equals(name)){
                return hotel;
            }
        }
        return null;
    }

}
