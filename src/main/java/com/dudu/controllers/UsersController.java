package com.dudu.controllers;

import com.dudu.dtos.User;
import com.dudu.logic.UsersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersLogic usersLogic;

    @PostMapping
    public void addUser(@RequestBody User user) {
        usersLogic.addUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        usersLogic.updateUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return usersLogic.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(name = "id") long id) {
        return usersLogic.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(name = "id") long id) {
        usersLogic.deleteUser(id);
    }

    @GetMapping("/byName")
    public User getUserByName(@RequestParam(name = "name") String name) {
        return usersLogic.getUserByName(name);
    }
}
