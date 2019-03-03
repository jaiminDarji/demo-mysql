package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.demo")
@EnableJpaRepositories("com.example.demo.repository")
@EntityScan("com.example.demo.domain")
public class DemoMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMySqlApplication.class, args);
	}

}
