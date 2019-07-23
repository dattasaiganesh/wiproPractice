package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.java.StudentDaoIfc")
@SpringBootApplication
public class SpringBootStartingPoint {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartingPoint.class, args);
		}

}
