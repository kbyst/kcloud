package com.github.kbyst.kcloudregistryconsul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableEurekaServer
@EnableDiscoveryClient
@EnableFeignClients
public class KcloudRegistryConsulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcloudRegistryConsulClientApplication.class, args);
	}
}
