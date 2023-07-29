package com.dyns.dyns.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

    public List<Student> getStudents() {
        // return List.of(new Student(
		// 	1L,
		// 	"dauren",
		// 	"dauren.shalabayev@gmail.com",
		// 	LocalDate.of(1988, 12, 10),
		// 	34


		// ));
		return studentRepository.findAll();
    }

	public void addNewStudent(Student student){
		System.out.println(student);
	}
}
