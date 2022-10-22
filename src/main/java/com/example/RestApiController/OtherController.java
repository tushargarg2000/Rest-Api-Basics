package com.example.RestApiController;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    //bY default the default constructor is called/....
    //The address of object in otherControllercom.example.RestApiController.User@177a253b
    //The address ob obj in myControllercom.example.RestApiController.User@177a253b

    @Autowired
    User otherControllerObject;


    @Autowired
    MyControllers obj;


    @GetMapping("/otherController")
    public User function(){

        otherControllerObject.setAge(100);
        System.out.println("The address of object in otherController"+otherControllerObject);
        return otherControllerObject;
    }

}
