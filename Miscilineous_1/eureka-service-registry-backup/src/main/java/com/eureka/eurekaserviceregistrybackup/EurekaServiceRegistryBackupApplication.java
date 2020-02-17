package com.eureka.eurekaserviceregistrybackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistryBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryBackupApplication.class, args);
	}

}
