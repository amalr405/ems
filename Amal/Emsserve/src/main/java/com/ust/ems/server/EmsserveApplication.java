package com.ust.ems.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmsserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsserveApplication.class, args);
	}

}
