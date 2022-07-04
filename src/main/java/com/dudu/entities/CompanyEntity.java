package com.dudu.entities;
import com.dudu.dtos.Company;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "address")
    private String address;

//    @OneToMany (mappedBy = "company", cascade = CascadeType.REMOVE)
//    private UserEntity user;


    public CompanyEntity() {
    }

    public CompanyEntity(Company company) {
        this.id = company.getId();
        this.name = company.getName();
        this.phoneNumber = company.getPhoneNumber();
        this.address = company.getAddress();
    }

    public CompanyEntity(String name, String phoneNumber, String address /*, UserEntity user*/) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
//        this.user = user;
    }

    public CompanyEntity(long id, String name, String phoneNumber, String address /*, UserEntity user*/) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
//        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public UserEntity getUser() {
//        return user;
//    }
//
//    public void setUser(UserEntity user) {
//        this.user = user;
//    }

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}