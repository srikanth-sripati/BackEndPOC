package com.backendpoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backendpoc.service.StudentService;

@SpringBootApplication
public class BackEndPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndPocApplication.class, args);
		System.out.println("Hello");
		System.out.println("Hello2u");		
	}
	
	
}
