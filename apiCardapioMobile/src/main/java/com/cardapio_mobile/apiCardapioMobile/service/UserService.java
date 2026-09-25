package com.cardapio_mobile.apiCardapioMobile.service;

import com.cardapio_mobile.apiCardapioMobile.controller.UserCreateDTO;
import com.cardapio_mobile.apiCardapioMobile.model.User;
import com.cardapio_mobile.apiCardapioMobile.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }




    public List<User> searchAll(){
        return userRepository.findAll();
    }



    public User createUser (UserCreateDTO userCreateDTO){

        User user = new User();
        user.setName(userCreateDTO.name());
        user.setEmail(userCreateDTO.email());
        user.setPassword(userCreateDTO.password());
        user.setCpf(userCreateDTO.cpf());
        user.setBirth_date(userCreateDTO.birth_date());

        return userRepository.save(user);
    }

}
