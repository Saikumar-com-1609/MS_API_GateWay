package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmsApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsApiGateWayApplication.class, args);
	}

}
