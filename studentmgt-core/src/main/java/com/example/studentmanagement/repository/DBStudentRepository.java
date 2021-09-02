package com.example.studentmanagement.repository;

import com.example.studentmanagement.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("DBRepo")
public class DBStudentRepository implements StudentRepository {

    @Override
    public Student addStudent(Student newStudent) {

        return newStudent;
    }

    @Override
    public Student getStudent(int studentId) {
        return null;
    }

    @Override
    public List<Student> listStudent() {

        return null;
    }

    @Override
    public void deleteStudentId(int studentId) {

    }
}

