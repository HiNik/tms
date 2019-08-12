package by.tms.repository.AL;

import by.tms.entity.Hotel;
import by.tms.entity.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Hotels {
    private static ArrayList<Hotel> hotels=new ArrayList<>();
    private static ArrayList<Room> rooms=new ArrayList<>();
    public void addHotel(Hotel hotel){hotels.add(hotel);}



    public void addRoom( Room room,String name) {
        for (Hotel hotel : hotels) {
            if (name.equals(hotel.getHotelName())) {
                hotel.getRooms().add(room);
            }
        }



      /*  Room curRoom=new Room(room.getType(),room.getPrice());
        Hotel hotel =getHotel(room.getHotel());
        ArrayList<Room> rooms=null;
        rooms=hotel.getRooms();
        rooms.add(room);
        hotel.setRooms(rooms);*/

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
