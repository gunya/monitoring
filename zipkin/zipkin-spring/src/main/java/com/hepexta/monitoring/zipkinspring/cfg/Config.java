package com.hepexta.monitoring.zipkinspring.cfg;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableAutoConfiguration
public class Config {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
