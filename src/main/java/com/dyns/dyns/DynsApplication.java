package com.dyns.dyns;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyns.dyns.student.Student;



@SpringBootApplication
@RestController
public class DynsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynsApplication.class, args);
	}

	@GetMapping
    public List<Student> hello() {
        return List.of(new Student(
			1L,
			"dauren",
			"dauren.shalabayev@gmail.com",
			LocalDate.of(1988, 12, 10),
			34


		));
    }

}
