package by.tms.repository.AL;

import by.tms.entity.Reservation;
import by.tms.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Reservations {
    private static ArrayList<Reservation> listRes=new ArrayList<>();
    private final Hotels hotels;

    public Reservations(Hotels hotels) {
        this.hotels = hotels;
    }

    public void addReser(User user,Reservation reservation){
        if(user.getReservations()==null){
            user.setReservations(new ArrayList<>());
        }
        user.getReservations().add(reservation);
        hotels.reservationRoom(reservation);
    }


}
