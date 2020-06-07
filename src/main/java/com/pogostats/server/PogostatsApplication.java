package com.pogostats.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages = "com.pogostats")
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("com.pogostats.repository")
@EntityScan("com.pogostats.entity")
public class PogostatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PogostatsApplication.class, args);
	}

}
