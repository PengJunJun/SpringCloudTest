package com.ibanyi.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IBanyiRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(IBanyiRegisterCenterApplication.class, args);
    }
}
