package com.example.cloud.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GetProperty {

    @Value("${foo.service.message: defaultMessage}")
    private String messageVersion;

    @RequestMapping("/foo")
    public String getMessageVersion() {
        return this.messageVersion;
    }
}
