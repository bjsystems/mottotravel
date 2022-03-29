package com.prototype.mottotravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.prototype" })
@SpringBootApplication
public class MottoTravelApplication {
    public static void main(String[] args) {
        SpringApplication.run(MottoTravelApplication.class, args);
    }
}
