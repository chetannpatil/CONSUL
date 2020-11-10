package com.chetan.consul.discovery.controller;

import java.net.URI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/provider")
public class ConsulDiscoveryController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoverClient;
	
	
	private static Logger LOGGER = LogManager.getLogger(ConsulDiscoveryController.class);
	
//	
//	@GetMapping(value = "/getBills")
//	public String getbills()
//	{
//		LOGGER.info("\n ConsulController - getRT- \n");
//		URI uri = discoverClient.getInstances("BillService")
//		.stream()
//		.map(si -> si.getUri()).findFirst()
//				.map(s -> s.resolve("/get2")).get();
//		
//		String string = restTemplate.getForObject(uri, String.class);
//		
//		return string ;
//	}
	
	@GetMapping(value = "/get")
	public String get()
	{
		LOGGER.info("\n ConsulController - getRT- \n");
//		URI uri = discoverClient.getInstances("BillService")
//		.stream()
//		.map(si -> si.getUri()).findFirst()
//				.map(s -> s.resolve("/get2")).get();
//		
//		String string = restTemplate.getForObject(uri, String.class);
//		
		return "HI fro provide" ;
	}
	
	
}
