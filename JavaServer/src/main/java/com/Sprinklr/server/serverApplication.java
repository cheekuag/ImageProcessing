package com.Sprinklr.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class serverApplication {

	private static final Logger logger = Logger.getLogger(serverApplication.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);
		logger.info("Starting gRPC client...");
		SpringApplication.run(serverApplication.class, args);
		System.out.println("Hello World!");
	}

}
