package com.dyns.dyns;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


import com.dyns.dyns.student.Student;



@SpringBootApplication

public class DynsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynsApplication.class, args);
	}

	

}