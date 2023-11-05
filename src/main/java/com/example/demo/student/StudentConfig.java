package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student melih = new Student(
                    1L,
                    "melih",
                    "Melih.yurt@gmail.com",
                    21,
                    LocalDate.of(1998, Month.JUNE, 6)

            );

            Student alex = new Student(
                    2L,
                    "alex",
                    "alex@gmail.com",
                    21,
                    LocalDate.of(1988, Month.JUNE, 3)

            );

            repository.saveAll(
                    List.of(melih, alex)
            );
        };
    }
}
