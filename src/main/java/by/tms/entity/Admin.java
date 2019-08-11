package by.tms.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity

public class Admin {

    private String name;

    private String Surname;

    private String password;

    private String mail;

    private String phone;



}
