package com.dudu.entities;

import com.dudu.dtos.User;
import com.dudu.enums.UserType;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "User_name", unique = true, nullable = false)
    private String username;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "Type", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType type;

    @ManyToOne
    private CompanyEntity company;

    public UserEntity() {
    }

    public UserEntity(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.type = user.getUserType();
    }

    public UserEntity(long id, String username, String password, String firstName, String lastName, UserType type, CompanyEntity company) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.company = company;
    }

    public UserEntity(String username, String password, String firstName, String lastName, UserType type, CompanyEntity company) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.company = company;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}