package com.systems.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class CourseApiDataApplication {

	public static void main(String[] args) {


		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
