package com.example.cydrop.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class SignupController {
    @Autowired
    UserRepository repository;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        List<User> allUsers = repository.findAll();
        for (User checkUser : allUsers) {
            if (checkUser.username.equals(user.username)) {
                return "User already exists";
            }
        }
        user = repository.save(user);
        // save is our Create mapping
        return "OK";
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        User user = repository.findById(id).get();
        user.password = null;
        // that way someone's password is hidden
        return user;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> users = repository.findAll();
        for (User cUser : users) {
            cUser.password = null;
        }
        return users;
    }

    @PutMapping("/users/{id}/name")
    public String changeName(@PathVariable Long id, @RequestBody String name) {
        User user = repository.findById(id).get();
        user.name = name;
        user = repository.save(user);
        return "Ok";
    }

    @DeleteMapping("/users/{id}")
    public String removeUser(@PathVariable Long id) {
        repository.deleteById(id);
        return "OK";
    }
}