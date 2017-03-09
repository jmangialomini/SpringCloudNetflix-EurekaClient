package com.autentia.spring.cloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class ApplicationClient {

	  @RequestMapping("/")
	  public String home() {
	    return "Autentia: REST Client - OK";
	  }
	  
	  @RequestMapping("/info")
	  public String info() {
	    return home();
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(ApplicationClient.class, args);
	  }

	}
