package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marian = new Student( "Mariana", "mariana@gmail.com", LocalDate.of(2000, Month.JANUARY, 6));

            Student alex = new Student("alex", "alex@gmail.com", LocalDate.of(2002, Month.JANUARY, 19));

            repository.saveAll(List.of(marian,alex));

        };
    }
}
