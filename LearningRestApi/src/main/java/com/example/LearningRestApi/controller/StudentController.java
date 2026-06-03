package com.example.LearningRestApi.controller;

import com.example.LearningRestApi.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(5l,"Ayush","ayushyadav14012002@gmail.com");

    }
}
