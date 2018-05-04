package com.github.kbyst.kcloudserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KcloudServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcloudServiceServerApplication.class, args);
	}
}
