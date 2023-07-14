package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }

}
