package com.example.RestApiController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //Annotation --> In this class I will the API's
public class MyControllers {
    public Logger logger = LoggerFactory.getLogger(MyControllers.class);
    @Autowired
    UserService userService;

    @GetMapping("/get_users")
    ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }

    @GetMapping("/logs")
    void printLogs(){

        logger.trace("Hi trace");
        logger.info("Hi info");
        logger.warn("Hi warn");
        logger.debug("Hi debug");
    }

    @PostMapping("/add_user_body")
    ResponseEntity<String> addUser(@RequestBody()User user){

        try{
            userService.addUser(user);
            return new ResponseEntity<>("Success",HttpStatus.CREATED);
        }catch(Exception e){

            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }







}
