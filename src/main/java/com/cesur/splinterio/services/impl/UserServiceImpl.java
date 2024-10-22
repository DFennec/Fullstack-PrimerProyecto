package com.cesur.splinterio.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;
import com.cesur.splinterio.repositories.UserRepository;
import com.cesur.splinterio.services.UserService;

public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    public UserDTO getUserByEmail(String email){
        User user=userRepository.getUserByEmail(email).get();
        UserDTO response = new UserDTO();
        response.setActive(user.getActive());
        response.setEmail(user.getEmail());
        response.setId(user.getId());
        response.setLastConnection(user.getLastConnection());
        response.setName(user.getName());
        response.setRol(user.getRol());
        return response;
    }
    public void updateUser(UserDTO user){
        for (User uDB : userRepository.findAll())
        {
            if (user.getId().equals(uDB.getId())){
                uDB.setActive(user.getActive());
                uDB.setEmail(user.getEmail());
                uDB.setName(user.getName());
                uDB.setRol(user.getRol());
                uDB.setLastConnection(user.getLastConnection());
                userRepository.save(uDB);
            }
        }
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public void storeUser(UserDTO user){
        for (User uDB : userRepository.findAll())
        {
            if (user.getId().equals(uDB.getId())){
                uDB.setActive(user.getActive());
                uDB.setEmail(user.getEmail());
                uDB.setName(user.getName());
                uDB.setRol(user.getRol());
                uDB.setLastConnection(user.getLastConnection());
                userRepository.save(uDB);
            }
        }
    }
}
