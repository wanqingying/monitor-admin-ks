package com.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootAppApplication {

    @GetMapping("/foo")
    public String foo() {
        return "bar v4";
    }
    public static void main(String[] args) {
        SpringApplication.run(BootAppApplication.class, args);
    }

}
