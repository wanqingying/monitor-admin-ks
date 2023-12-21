package com.boot.app;

import de.codecentric.boot.admin.server.config.AdminServerHazelcastAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

//@RestController
@SpringBootApplication
@EnableAdminServer
public class BootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAppApplication.class, args);
    }

}
