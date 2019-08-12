package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Room extends Hotel {

    private String type;

    private int price;

    @Override
    public String toString() {
        return "Room: " +
                "type: '" + type + '\'' +
                ", price: " + price ;
    }
}
