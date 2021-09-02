package com.example.studentmanagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Arrays;

@JsonPropertyOrder({"studentId", "fname", "lname", "courses"})
public class Student {

    protected int studentId;

    @JsonProperty("fname")
    protected String firstName;

    @JsonProperty("lname")
    protected String lastName;

    protected String[] courses;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String[] getCourses() {
        return courses;
    }

    public Student(int id, String firstName, String lastName, String[] courses) {
        {
            this.studentId = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.courses = courses;
        }


    }
}

