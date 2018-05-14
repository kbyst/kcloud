package com.github.kbyst.kcloudregistryconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class KcloudRegistryConsulApplication {

	@RequestMapping("/test")
	public Object test() {
		System.out.println("ttttttttt");
		return "tttttttttt";
	}

	public static void main(String[] args) {
		SpringApplication.run(KcloudRegistryConsulApplication.class, args);
	}
}
