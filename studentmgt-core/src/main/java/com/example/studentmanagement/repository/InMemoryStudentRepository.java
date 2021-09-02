package com.example.studentmanagement.repository;

import com.example.studentmanagement.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Profile("inMemoryRepository")
public class InMemoryStudentRepository implements StudentRepository {

    final private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public Student addStudent(Student newStudent) {
        studentMap.put(newStudent.getStudentId(), newStudent);
        return newStudent;
    }

    @Override
    public Student getStudent(int studentId) {
        return studentMap.get(studentId);
    }

    public List<Student> listStudent() {
        List<Student> listStudents = new ArrayList(studentMap.values());
        return listStudents;
    }

    @Override
    public void deleteStudentId(int studentId) {
        studentMap.remove(studentId);
    }

}

