package com.offertest.UserAPI.entities;

import com.offertest.UserAPI.enumrator.Gender;
import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="USER",schema="PUBLIC",catalog="USER_API")
public class UserEntity {
    private Integer id;
private  String username;
private Date birthdate;
private String country;
private String phone;
private Gender gender;

    public UserEntity() {
        super();
    }

    public UserEntity(Integer id, String username, Date birthdate, String country) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
    }

    public UserEntity(Integer id, String username, Date birthdate, String country, String phone, Gender gender) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.phone = phone;
        this.gender = gender;
    }

    public UserEntity(Integer id, String username, Date birthdate, String country, String phone) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.phone = phone;
    }

    public UserEntity(Integer id, String username, Date birthdate, String country, Gender gender) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.country = country;
        this.gender = gender;
    }
@Id
@Column(name="ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
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
