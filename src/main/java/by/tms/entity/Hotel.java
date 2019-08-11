package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;

@Data
@Entity
public class Hotel {
    public Hotel(String hotelName, String hotelDescription) {
        this.hotelName = hotelName;
        this.hotelDescription = hotelDescription;
    }

    public Hotel() {
    }

    private String hotelName;

    private String hotelDescription;

    private ArrayList<Room> rooms;
}
