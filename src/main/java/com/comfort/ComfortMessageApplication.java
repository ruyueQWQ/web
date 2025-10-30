package com.comfort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.comfort")
public class ComfortMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComfortMessageApplication.class, args);
    }

}