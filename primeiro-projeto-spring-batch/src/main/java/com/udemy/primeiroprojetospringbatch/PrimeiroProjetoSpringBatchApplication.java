package com.udemy.primeiroprojetospringbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.udemy.primeiroprojetospringbatch")
public class PrimeiroProjetoSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringBatchApplication.class, args);
	}

}
