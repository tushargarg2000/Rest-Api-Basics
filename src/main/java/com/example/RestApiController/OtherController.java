package com.example.RestApiController;


import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    public Logger logger = LoggerFactory.getLogger(OtherController.class);
    //bY default the default constructor is called/....
    //The address of object in otherControllercom.example.RestApiController.User@177a253b
    //The address ob obj in myControllercom.example.RestApiController.User@177a253b


    @Autowired
    MyControllers obj;

    @GetMapping("/getLogs")
    void getLogs(){

        logger.trace("Hi trace");
        logger.info("Hi info");
        logger.warn("Hi warn");
        logger.debug("Hi debug");

    }


}
