package com.autentia.spring.cloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationEureka {
 
	public static void main(String[] args) {
     SpringApplication.run(ApplicationEureka.class, args);
    }

}
