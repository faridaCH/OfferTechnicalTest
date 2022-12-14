package com.offertest.UserAPI.entities;

import com.offertest.UserAPI.enumerator.Gender;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="USER",schema="PUBLIC",catalog="USER_API")
public class UserEntity {
    private int id;
private  String username;
private LocalDate birthdate;
private String country;
private String phone;
private Gender gender;

    public UserEntity() {
        super();
    }

    public UserEntity(int id, String username, LocalDate birthdate, String country) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
    }

    public UserEntity(int id, String username, LocalDate birthdate, String country, String phone, Gender gender) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.phone = phone;
        this.gender = gender;
    }

    public UserEntity(int id, String username, LocalDate birthdate, String country, String phone) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.phone = phone;
    }

    public UserEntity(int id, String username, LocalDate birthdate, String country, Gender gender) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.gender = gender;
    }
@Id
@Column(name="ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Basic
@Column(name="USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Basic
    @Column(name="BIRTHDATE")
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate (LocalDate  birthdate) {
        this.birthdate = birthdate;
    }
    @Basic
    @Column(name="COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Basic
    @Column(name="PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Basic
    @Column(name="GENDER")
    @Enumerated
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthdate=" + birthdate +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
