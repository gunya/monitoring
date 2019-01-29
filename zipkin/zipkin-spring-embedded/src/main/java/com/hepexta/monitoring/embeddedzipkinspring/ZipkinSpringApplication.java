package com.hepexta.monitoring.embeddedzipkinspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinSpringApplication.class, args);
    }

}