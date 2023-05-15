package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaU1P4TJaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4TJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Nuevo proyecto en Github");
		System.out.println("Cambio en nueva branch");
	}

}
