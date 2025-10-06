package com.guilhermegarap.projetovendas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermegarap.projetovendas.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserControler {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("maria@gmail.com", 1L, "Maria", "maria123", "99999999");
        return ResponseEntity.ok().body(u);
    }
}
