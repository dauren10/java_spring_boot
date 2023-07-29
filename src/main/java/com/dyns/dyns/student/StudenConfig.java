package com.dyns.dyns.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import java.time.LocalDate;

@Configuration
public class StudenConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
                Student mariam=  new Student(
                	"mariam",
                	"mariam@gmail.com",
                	LocalDate.of(1988, 12, 10)
                );

                Student abay=  new Student(
                	"abay",
                	"abayv@gmail.com",
                	LocalDate.of(1988, 12, 10)
                );

                repository.saveAll(List.of(mariam,abay));
        };
    };
}

