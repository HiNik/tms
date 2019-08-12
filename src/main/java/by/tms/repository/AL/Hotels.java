package by.tms.repository.AL;

import by.tms.entity.Hotel;
import by.tms.entity.Reservation;
import by.tms.entity.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Hotels {
    private static ArrayList<Hotel> hotels=new ArrayList<>();

    public void addHotel(Hotel hotel){
        hotel.setRooms(new ArrayList<>());
        hotels.add(hotel);
   }



    public void addRoom( Room room) {
        for (Hotel hotel : hotels) {
            if (room.getHotelName().equals(hotel.getHotelName())) {
                hotel.getRooms().add(room);
            }
        }
    }

    public ArrayList<Hotel> getAllHotels(){
        return hotels;}

    public ArrayList<Room> getAllRooms(Hotel hotel){
        return hotel.getRooms();
    }

    public Hotel getHotelByName(String name){
        for(Hotel hotel:hotels){
            if(name.equals(hotel.getHotelName())){
                return hotel;
            }
        }
        return null;
    }



    private Hotel getHotel(String name){
        for(Hotel hotel:hotels){
            if(hotel.getHotelName().equals(name)){
                return hotel;
            }
        }
        return null;
    }

    public void reservationRoom(Reservation reservation){
        for(Hotel hotel:hotels){
            if(reservation.getHotel().equals(hotel.getHotelName())){
                for(Room room:hotel.getRooms()){
                    if(reservation.getRoom().getType().equals(room.getType()) && reservation.getRoom().getPrice()==room.getPrice() ){
                        hotel.getRooms().remove(room);
                    }
                }
            }
        }

    }

}
