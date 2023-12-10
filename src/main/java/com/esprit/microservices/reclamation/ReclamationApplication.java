package com.esprit.microservices.reclamation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableDiscoveryClient
public class ReclamationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReclamationApplication.class, args);
    }

}
