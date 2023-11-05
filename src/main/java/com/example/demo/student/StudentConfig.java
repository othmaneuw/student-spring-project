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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student othmane = new Student(
                    1L,
                    "Othmane",
                    LocalDate.of(2001, Month.AUGUST,19),
                    "elkhemmarothmane@gmail.com"

            );

            repository.saveAll(List.of(othmane));
        };
    }
}
