package com.chetan.consul.discovery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.chetan.consul.discovery.controller.ConsulDiscoveryController;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulDiscoveryApplication {

	private static Logger LOGGER = LogManager.getLogger(ConsulDiscoveryApplication.class);
	
	
	@Bean
	public RestTemplate getRT()
	{
		LOGGER.info("\n ConsulDiscoveryApplication - getRT- \n");
		
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		
		LOGGER.info("\n ConsulController - getRT- \n");
		SpringApplication.run(ConsulDiscoveryApplication.class, args);
		
		
	}

}
