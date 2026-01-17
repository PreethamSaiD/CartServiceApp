package com.preetham.CartService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class HealthCheck {

    @GetMapping("/health")
    public String health(){
        return "Service is up and Running..";
        //return "https://http.cat/200.jpg";
    }
    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World!");
    }

    //The below method is to redirect the controller to the catapi for the successful return code.
    @GetMapping("/cat/{status}")
    public ResponseEntity<Void> redirectToHttpCat(@PathVariable int status) {
        URI uri = URI.create("https://http.cat/" + status);
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(uri)
                .build();
    }
}
