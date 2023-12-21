package com.boot.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/uv")
public class UserController {
    @GetMapping("/foa")
    public String fooV2() {
        return "bar v6";
    }
}
