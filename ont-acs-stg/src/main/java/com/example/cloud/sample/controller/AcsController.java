package com.example.cloud.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AcsController {

    @Value("${version: default}")
    private String componentVersion;

    @Value("${component.name: default}")
    private String componentName;

    @Value("${location: default}")
    private String componentLoc;

    @RequestMapping("/version")
    public String getComponentVersionAcsDC1() {
        return this.componentVersion;
    }

    @RequestMapping("/name")
    public String getComponentNameAcsDC1() {
        return this.componentName;
    }

    @RequestMapping("/loc")
    public String getComponentLocAcsDC1() {
        return this.componentLoc;
    }
}

