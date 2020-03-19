package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/")
public class HelloController{


    @GetMapping(value = "/hello.ds")
    public String sayHello(ModelMap model) {
        return "success";
    }

}
