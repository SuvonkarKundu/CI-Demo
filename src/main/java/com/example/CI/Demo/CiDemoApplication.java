package com.example.CI.Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoApplication implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(CiDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CiDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("It is second logger");
		logger.info("Continuous Integration Test ");
	}
}
