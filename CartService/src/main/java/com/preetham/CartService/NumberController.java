package com.preetham.CartService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {


    @GetMapping("/hello")
    public int hello(){
        return (int)(Math.random()*1000);
    }
}
