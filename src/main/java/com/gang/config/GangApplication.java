package com.gang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:DB.yml" })
public class GangApplication {

	public static void main(String[] args) {
		SpringApplication.run(GangApplication.class, args);
	}
}
