package com.example.RestApiController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //Annotation --> In this class I will the API's
public class MyControllers {

    @Autowired
    User myControllerObj;

    @GetMapping("/myController")
    public User function(){


        System.out.println("The address ob obj in myController"+myControllerObj);
        return myControllerObj;
    }


    //DB Purpose
    HashMap<Integer,User> users = new HashMap<>();


    //http:localhost:8080/get_users
    @GetMapping("/get_users")
    public List<User> getAllUser(){

        //Server side logic
        List<User> listOfUsers = new ArrayList<>();

        for(User user : users.values()){
            listOfUsers.add(user);
        }
//        for(Map.Entry<Integer,User> entry:users.entrySet()){
//
//            listOfUsers.add(entry.getValue());
//        }
        return listOfUsers;
    }


    //localhost:8080/get_user?id=10&name=tushar&country=10
    // ? is used to differentiate between RequestParams and Endpoint
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id")int id){
        return users.get(id);
    }

    //URL that
    @PostMapping("/add_user")
    public void addUser(@RequestParam(value = "id")int id,@RequestParam("name")String name,
                        @RequestParam("country")String country,@RequestParam("age")int age){

        User user = new User(id,name,country,age);
        users.put(id,user);

    }

    @PostMapping("/add_user_body")
    public void addUser(@RequestBody(required = true)User user){

        users.put(user.getId(),user);
    }

    @PutMapping("/modify_user")
    public User modifyUser(@RequestBody()User user){

        users.put(user.getId(),user);
        return user;
    }



    @DeleteMapping("/delete_user/{id}")
    public void deleteUser(@PathVariable("id")int id){

        users.remove(id);
    }
    /*


      http://localhost:8080/add_user?id=1&name=sydney&country=India&age=23
    localhost:8080/add_user?id=8&name=Eshwar&country=india&age=24
    https://localhost:8080/add_users?id=1&name=jitesh&country=india&age=23
    http:localhost:8080/add_user?id=20&name="bharat"&country="india"&age=20
     */



}
