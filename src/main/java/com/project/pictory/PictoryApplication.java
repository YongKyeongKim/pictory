package com.project.pictory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PictoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictoryApplication.class, args);
	}

}
