package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CurUser {

    private String mail;
    private String password;
}
