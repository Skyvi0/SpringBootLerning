package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->  {
            Student john = new Student(
                    "John",
                    "john.lane@gmail.com",
                    LocalDate.of(1990, 1, 1)
            );

            Student kaley = new Student(
                    "Kaley",
                    "kayley.reese@gmail.com",
                    LocalDate.of(2000, 4, 3)
            );

            repository.saveAll(
                    List.of(kaley, john)
            );
        };
    }
}
