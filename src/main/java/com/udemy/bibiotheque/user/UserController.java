package com.udemy.bibiotheque.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping(value = "/users")
    public ResponseEntity addUser(User user){
        User userOld = new User("vecteur@gmail.com");

        return  new ResponseEntity(userOld, HttpStatus.CREATED);

    }
}
