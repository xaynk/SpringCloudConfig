package com.example.cloud;

import com.example.cloud.controller.GetProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FooService {

    public static void main(String[] args) {
        SpringApplication.run(FooService.class, args);
    }
}
