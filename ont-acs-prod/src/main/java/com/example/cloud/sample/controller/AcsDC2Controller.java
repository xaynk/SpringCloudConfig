package com.example.cloud.sample.controller;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RefreshScope
@RestController
public class AcsDC2Controller {

    @Value("${version: default}")
    private String componentVersion;

    @Value("${component.name: default}")
    private String componentName;

    @Value("${location: default}")
    private String componentLocation;

//    @Autowired
//    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/version")
    public String getComponentVersionDC2() {
        return this.componentVersion;
    }

    @RequestMapping("/name")
    public String getComponentNameDC2() {
        return this.componentName;
    }

    @RequestMapping("/loc")
    public String getComponentLocDC2() {
        return this.componentLocation;
    }

//    @RequestMapping("/getAcs")
//    public String getAcsName() throws IOException {
//
//        Application application = eurekaClient.getApplication("ont-acs");
//        InstanceInfo instanceInfo = application.getInstances().get(0);
//        String hostname = instanceInfo.getHostName();
//        System.out.println("_________******" + instanceInfo.getHealthCheckUrl());
//        int port = instanceInfo.getPort();
//        String url=hostname+":"+port+"/name";
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(url);
//        HttpResponse response = client.execute(request);
//        return response.getStatusLine().toString();
//
////        System.out.println("Response Code : "
////                + response.getStatusLine().getStatusCode());
////
////        System.out.println(url);
////        return new RestTemplate().getForEntity(url,String.class).toString();
//
//
//    }
}

