package com.example.demoDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDockerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
		System.out.println("SYSTEM"+System.getenv());
		System.out.println("System is running");
	}

}
