package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Reservation extends User {
    private Hotel hotel;
    private Room room;

}
