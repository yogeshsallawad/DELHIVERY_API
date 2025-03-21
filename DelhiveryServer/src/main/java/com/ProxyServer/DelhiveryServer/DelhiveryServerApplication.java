package com.ProxyServer.DelhiveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DelhiveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DelhiveryServerApplication.class, args);
		System.out.println("Hello World");
	}
	
	
	@Bean
	public RestTemplate restTamplate() {
		return new RestTemplate();
	}
}
