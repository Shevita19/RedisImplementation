package com.demo.RedisImplementation.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {    //redis don't understand Java object need to serialise the object we are storing
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;

}
