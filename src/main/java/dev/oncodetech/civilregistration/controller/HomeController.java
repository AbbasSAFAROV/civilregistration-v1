package dev.oncodetech.civilregistration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String index(){
        return "Selam Dunya!";
    }

    @PostMapping
    public String postMethod(){
        return "Post created";
    }

}
