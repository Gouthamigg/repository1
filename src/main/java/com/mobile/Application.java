package com.mobile;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application {

	/*@Bean
	CommandLineRunner StockOnConsole() {
		return args -> {
			// StockConsole.FluxallException().subscribe(System.out::println);
			StockConsole.all().subscribe(System.out::println);
		};
	};*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}