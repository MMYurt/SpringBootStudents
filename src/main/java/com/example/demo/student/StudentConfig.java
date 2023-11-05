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
                    "melih",
                    "Melih.yurt@gmail.com",
                    LocalDate.of(1998, Month.JUNE, 6)

            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(1988, Month.JUNE, 3)

            );

            repository.saveAll(
                    List.of(melih, alex)
            );
        };
    }
}
