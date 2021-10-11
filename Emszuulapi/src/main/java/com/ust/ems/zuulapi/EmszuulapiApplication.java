package com.ust.ems.zuulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class EmszuulapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmszuulapiApplication.class, args);
	}

}
