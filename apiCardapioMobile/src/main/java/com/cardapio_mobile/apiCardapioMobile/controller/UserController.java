package com.cardapio_mobile.apiCardapioMobile.controller;


import com.cardapio_mobile.apiCardapioMobile.model.User;
import com.cardapio_mobile.apiCardapioMobile.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping
    private ResponseEntity<List<User>> List(){
        return ResponseEntity.ok(userService.searchAll());
    }

    @PostMapping
    private ResponseEntity<User> createUser (@RequestBody UserCreateDTO userCreateDTO) {

        User user = userService.createUser(userCreateDTO);

        return ResponseEntity.ok(user);
    }

}
