package com.example.studentmanagement.controller;


import com.example.studentmanagement.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentRepository.listStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        if (studentRepository.getStudent(id) == null) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().body(studentRepository.getStudent(id));
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        if (student == null) {
            return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
        } else {
            HttpHeaders httpHeaders= new HttpHeaders();
            httpHeaders.setLocation(URI.create("http://localhost:8080/api/students/" +student.getStudentId()));
            return new ResponseEntity<Student>(studentRepository.addStudent(student),httpHeaders, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
        if (studentRepository.getStudent(id) == null) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
        else {
            studentRepository.deleteStudentId(id);
            return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
        }
    }
}

