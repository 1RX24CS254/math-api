package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Tells Spring this class handles HTTP requests
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // This creates the endpoint: /add?a=5&b=10
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return String.format("The sum of %d and %d is: %d", a, b, sum);
    }
}
