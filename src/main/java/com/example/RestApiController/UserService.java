package com.example.RestApiController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //I will write the logic

    List<User> getAllUser(){

        return userRepository.getAllUsersFromDatabase();
    }

    void addUser(User user){

        userRepository.addUser(user);
    }
}
