package com.example.office;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfficeApplication {

	public static void main(String[] args) {
		System.out.println("new app");
		SpringApplication.run(OfficeApplication.class, args);
	}

}
