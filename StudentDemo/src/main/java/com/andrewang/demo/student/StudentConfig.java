package com.andrewang.demo.student;

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

            Student alex  = new Student(
                    "Alex",
                    LocalDate.of(1936, Month.JANUARY, 1),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(alex)
            );
        };
    }
}
