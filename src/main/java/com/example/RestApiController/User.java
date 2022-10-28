package com.example.RestApiController;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class User {

    private int id;
    private String name;
    private String country;
    private int age;

    public User(){
        //Spring creates an object using the default constructor
        //only when an @Component is wrriten on the class
        //directly or indirectly
        System.out.println("Default Constructor is called whilte" +
                "creating the user object");
    }

    public User(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
