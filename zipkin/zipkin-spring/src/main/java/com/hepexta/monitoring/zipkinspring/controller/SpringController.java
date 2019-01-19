package com.hepexta.monitoring.zipkinspring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringController {

    private static Logger log = LoggerFactory.getLogger(SpringController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return "Find trace in <a href=http://localhost:9411/zipkin/>http://localhost:9411/zipkin/</a>";
    }

    @RequestMapping("/")
    public String index() {
        log.info("Hello there");
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/hello", String.class);
        log.info(response.getBody());
        return response.getBody();
    }
}
