package com.example.cloud.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DvController {

    @Value("${version: default}")
    private String componentVersion;

    @Value("${component.name: default}")
    private String componentName;

    @RequestMapping("/version")
    public String getComponentVersionDv() {
        return this.componentVersion;
    }

    @RequestMapping("/name")
    public String getComponentNameDv() {
        return this.componentName;
    }
}

