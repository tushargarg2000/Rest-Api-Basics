package com.example.RestApiController;


import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class UserRepository {



    HashMap<Integer,User> users = new HashMap<>();

    //function that interact with the DB

    List<User> getAllUsersFromDatabase(){

        List<User> userList = new ArrayList<>();

        for(User user:users.values()){
            userList.add(user);
        }
        return userList;
    }

    void addUser(User user){

        users.put(user.getId(), user);

    }

}
