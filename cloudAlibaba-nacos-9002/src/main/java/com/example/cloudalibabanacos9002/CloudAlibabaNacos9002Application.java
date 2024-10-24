package com.example.cloudalibabanacos9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacos9002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacos9002Application.class, args);
    }

}
