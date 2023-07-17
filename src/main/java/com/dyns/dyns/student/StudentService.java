package com.dyns.dyns.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
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
