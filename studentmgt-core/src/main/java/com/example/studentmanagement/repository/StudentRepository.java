package com.example.studentmanagement.repository;

import com.example.studentmanagement.Student;

import java.util.List;


public interface StudentRepository {
    public Student addStudent(Student newStudent);

    public Student getStudent(int studentId);

    public List<Student> listStudent();

    public void deleteStudentId(int studentId);


}
