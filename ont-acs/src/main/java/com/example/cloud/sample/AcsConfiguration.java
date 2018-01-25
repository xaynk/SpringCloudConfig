package com.example.cloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AcsConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(AcsConfiguration.class, args);
    }
}
