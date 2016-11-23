package com.example.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* to expose as a rest service, advantage is no need to add request and responce body but in controller we need to add both */
public class MyFirstController {

    @RequestMapping(value = "/", method = RequestMethod.GET) // actualy link http://localhost:9090/sg
    public String greet() {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        return (hour < 12) ? "Good Morning" : "Good afternoon";

    }

}
