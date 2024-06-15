package com.java.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Value("${browser_name}")
    public String browser_name;
    @Value("${author_name}")
    public String author_name;
    @Value("${address}")
    public String address;

    @GetMapping("/first")
    public String firstEndPoint(){
        System.out.println("I am in first End-point...hiii");
        return "Browser Name: "+browser_name+", "+"Author Name: "+author_name+", Address: "+address;
    }
}
