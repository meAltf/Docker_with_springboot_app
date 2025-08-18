package com.robert.learn.docker.Service;

import com.robert.learn.docker.Model.Student;
import com.robert.learn.docker.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(new Student());
    }

    public Student addStudent() {
        Student student = new Student();
       // student.setId(4);
        student.setName("docker-child");
        student.setAge(20);

        studentRepository.save(student);
        return student;
    }
}
