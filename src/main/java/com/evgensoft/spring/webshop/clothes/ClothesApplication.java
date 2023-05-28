package com.evgensoft.spring.webshop.clothes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class ClothesApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClothesApplication.class, args);
	}

}
