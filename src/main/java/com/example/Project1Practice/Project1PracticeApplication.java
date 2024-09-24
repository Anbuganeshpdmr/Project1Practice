package com.example.Project1Practice;

import com.example.Project1Practice.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Project1PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1PracticeApplication.class, args);
	}

}
