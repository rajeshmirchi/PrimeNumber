package com.synechron.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SpringBootRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
