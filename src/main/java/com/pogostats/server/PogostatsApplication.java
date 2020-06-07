package com.pogostats.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.pogostats.*")
@SpringBootApplication
public class PogostatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PogostatsApplication.class, args);
	}

}
