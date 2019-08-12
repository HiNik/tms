package by.tms.service;

import by.tms.entity.Reservation;
import by.tms.entity.User;
import by.tms.repository.AL.Reservations;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final Reservations reservations;

    public ReservationService(Reservations reservations) {
        this.reservations = reservations;
    }


    public void addReser(User user, Reservation reservation){
        reservations.addReser(user,reservation);
    }
}
