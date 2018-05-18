package com.github.kbyst.kcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KcloudRegistryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcloudRegistryEurekaServerApplication.class, args);
	}
}
