package com.dxc.demoapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

@GetMapping("/suneel")
@ResponseBody
    public String suneel(){
        return "hello mom this is me suneel!!!!"; 
    }
    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1,@PathVariable int num2){
        return +(num1+num2);
    }
}
