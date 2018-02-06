package com.example.cloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AcsDC1Configuration {

    public static void main(String[] args) {
        SpringApplication.run(AcsDC1Configuration.class, args);
    }
}
