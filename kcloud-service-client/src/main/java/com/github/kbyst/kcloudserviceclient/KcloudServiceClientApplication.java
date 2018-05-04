package com.github.kbyst.kcloudserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class KcloudServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcloudServiceClientApplication.class, args);
	}
}
