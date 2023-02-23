package com.evidencijaplinomjera.fullstackbackend.controller;


import com.evidencijaplinomjera.fullstackbackend.exception.UserNotFoundException;
import com.evidencijaplinomjera.fullstackbackend.model.User;
import com.evidencijaplinomjera.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setPrezime(newUser.getPrezime());
                    user.setIme(newUser.getIme());
                    user.setAdresa(newUser.getAdresa());
                    user.setGrad(newUser.getGrad());
                    user.setDrzava(newUser.getDrzava());
                    user.setZipcode(newUser.getZipcode());
                    user.setBroj_plinomjera(newUser.getBroj_plinomjera());
                    user.setStanje_plinomjera(newUser.getStanje_plinomjera());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id " + id + " has been deleted success.";
    }




}
