package com.project.pa.pa3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
///@EntityScan("com.project.pa.pa3.model")
///@EnableJpaRepositories("com.project.pa.pa3.repository")
public class Pa3Application {

	public static void main(String[] args) {
		SpringApplication.run(Pa3Application.class, args);
	}

}
