package com.bicar.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
@EnableJpaRepositories("com.bicar.dao")
@EntityScan("com.bicar.entity")
@ComponentScan("com.*")
public class LoginApplication {


	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	
}
