package com.dyns.dyns.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(
			1L,
			"dauren",
			"dauren.shalabayev@gmail.com",
			LocalDate.of(1988, 12, 10),
			34


		));
    }
}
