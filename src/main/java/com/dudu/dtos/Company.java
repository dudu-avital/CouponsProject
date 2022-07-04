package com.dudu.dtos;

import com.dudu.entities.CompanyEntity;

public class Company {
    private long id;
    private String name;
    private String phoneNumber;
    private String address;

    public Company() {
    }

    public Company(long id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Company(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // מקבל companyEntity ומעתיק את התכונות הרלוונטיות כלומר המרה לdto
    public Company(CompanyEntity companyEntity) {
        this.address = companyEntity.getAddress();
        this.id = companyEntity.getId();
        this.phoneNumber = companyEntity.getPhoneNumber();
        this.name = companyEntity.getName();
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

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
