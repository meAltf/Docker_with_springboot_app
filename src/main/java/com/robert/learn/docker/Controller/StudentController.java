package com.robert.learn.docker.Controller;

import com.robert.learn.docker.Model.Student;
import com.robert.learn.docker.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList =  studentService.getAllStudents();
        return studentList;
    }
}
