package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Room {
    private String Hotel;
    private String type;

    private int price;


}
