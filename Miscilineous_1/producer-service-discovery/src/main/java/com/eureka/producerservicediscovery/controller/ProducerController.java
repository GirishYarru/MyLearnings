package com.eureka.producerservicediscovery.controller;

import java.util.Date;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ProducerController {

	@HystrixCommand(fallbackMethod = "fallbackMethod")
	@RequestMapping(value = "/printProducerName/{name}")
	public String printProducerName(@PathVariable(name = "name") String name,
			@RequestParam(value = "id", required = false) String id) {
		if (true) {
			throw new RuntimeException("Exception Occured");
		}
		System.out.println("******* In Actual method ******");

		return "Hello  " + name + " id: " + id + " Responsed on : " + new Date();
	}

	public String fallbackMethod(String name, String id) {
		System.out.println("******* In fallback method ******");
		return "fallBackHello";
	}

}
