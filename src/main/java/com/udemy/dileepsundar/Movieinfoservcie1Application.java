package com.udemy.dileepsundar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.udemy.dileepsundar.controller","com.udemy.dileepsundar.service"})
@EntityScan(basePackages = "com.udemy.dileepsundar.entity") 
@EnableReactiveMongoRepositories(basePackages = "com.udemy.dileepsundar.repository")
public class Movieinfoservcie1Application {

	public static void main(String[] args) {
		SpringApplication.run(Movieinfoservcie1Application.class, args);
	}

}
