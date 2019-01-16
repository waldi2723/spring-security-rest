package com.example.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/api/foos")
    public String get() {
        return "user hello!";
    }

    @RequestMapping("/api/admin/**")
    public String getAdmin(){
        return "admin hello";
    }
}
