package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaRibbonJt2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEurekaRibbonJt2Application.class, args);

    }

}