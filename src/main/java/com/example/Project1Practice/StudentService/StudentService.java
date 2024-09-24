package com.example.Project1Practice.StudentService;

import com.example.Project1Practice.Student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "Anbu", "a@gmail.com", LocalDate.of(1992, Month.SEPTEMBER, 26), 32),
                new Student(2L, "Ganesh", "gan@gmail.com", LocalDate.of(1996, Month.AUGUST, 04), 28));
    }
}
