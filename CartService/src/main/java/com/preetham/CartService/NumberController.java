package com.preetham.CartService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {


        @GetMapping("/hello")
        public int hello(){
        return (int)(Math.random()*1000);
        }
        @GetMapping("/hello/{name}")
        public String name(@PathVariable String name){
            return "Hi "+ name+"!";
        }

        @GetMapping("/add")
        public int add(@RequestParam int a,@RequestParam int b){
        return a+b;
        }
    }

