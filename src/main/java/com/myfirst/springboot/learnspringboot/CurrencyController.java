package com.myfirst.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
The Goal is to get a response application.properties object information
when we run our localHost 8080
//http://localhost:8080/currency-configuration
And using our new CurrencySerciceConfiguration class
    {
    "url": "http://default.in28minutes.com",
    "username": "defaultusername",
    "key": "defaultkey"
    }
 */

//1. We use @RestController annotation
@RestController
public class CurrencyController {
//2. Our goal is to retrieve application.properties object information
//3. We need to create a class "CurrencyServiceConfiguration" so we can instantiate the object from, define private properties and define getters and setters

//4. We want to retrieve the properties information when we use http://localhost:8080/currency-configuration
    //4.1 To do that we use @Autowired annotation and define as private CurrencyServiceConfiguration
    //4.2 To do that we use @RequestMapping annotation on top of our method
    //4.3 Define next to the @RequestMapping annotation the folder like below. Example: @RequestMapping("/currency-configuration")
    //4.4 Return the values of configuration
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }

//5. Now to run it we need to run LearnSpringBootApplication class
//6. Navigate to http://localhost:8080/currency-configuration
//7. It will display application.properties object information

}
