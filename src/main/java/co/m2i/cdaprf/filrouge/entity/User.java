package co.m2i.cdaprf.filrouge.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String surname;
    @NotBlank
    private String lastname;
    private Date birthdDate;
    @NotBlank
    private String email;
    @NotBlank
    private String password;

    public User() {
    }

    public User(String surname, String lastname, Date birthdDate, String email, String password) {
        this.surname = surname;
        this.lastname = lastname;
        this.birthdDate = birthdDate;
        this.email = email;
        this.password = password;
    }
    
    public User(int id, String surname, String lastname, Date birthdDate, String email, String password) {
        this.id = id;
        this.surname = surname;
        this.lastname = lastname;
        this.birthdDate = birthdDate;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(Date birthdDate) {
        this.birthdDate = birthdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
