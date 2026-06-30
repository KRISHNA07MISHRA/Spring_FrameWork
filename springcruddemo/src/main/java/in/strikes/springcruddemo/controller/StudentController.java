package in.strikes.springcruddemo.controller;

import in.strikes.springcruddemo.Entity.student;
import in.strikes.springcruddemo.service.studentService;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    private studentService studentServices;
    public StudentController(studentService studentService){
        this.studentServices = studentService;
    }

    @PostMapping 
    public String createStudent(@RequestBody student student){
        student createdStudent = studentServices.createStudent(student);
        return "Student created";
    }
}
