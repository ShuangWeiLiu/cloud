package com.lsw.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfServerApplication.class, args);
	}
}
