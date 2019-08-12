package by.tms.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "USERS")
//@NamedQuery(name = "findUserByID", query = "select User from User where name = :id and age =:age")
public class User implements Serializable {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  private String name;

  private String surname;

  @Column(name = "AGE")
  private Integer age;

  private String phone;

  private String mail;

  private String password;

  private ArrayList<Reservation> reservations;

  public User(String name, String surname, Integer age, String phone, String mail, String password,int id) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.phone = phone;
    this.mail = mail;
    this.password = password;

  }

  public User() {
  }
  //  @OneToOne
}
