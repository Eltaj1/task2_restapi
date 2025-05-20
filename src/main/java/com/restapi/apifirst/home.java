package com.restapi.apifirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/")
    public String home() {
        return "Hi. Here you will see the first web app using Java";
    }

    @GetMapping("/test")
    public String test() {
        return "";
    }
}