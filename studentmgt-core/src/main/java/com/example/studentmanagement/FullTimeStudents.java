package com.example.studentmanagement;

import java.util.Arrays;

public class FullTimeStudents extends Student {

    private String hostelastName;
    private int year;

    @Override
    public String toString() {
        return "FullTimeStudent : {" +
                " Student Id =" + studentId +
                ", First Name ='" + firstName + '\'' +
                ", Last Name ='" + lastName + '\'' +
                ",Hostel Name='" + hostelastName + '\'' +
                ", Year =" + year +
                ", Courses =" + Arrays.toString(courses) +
                '}';
    }

    public FullTimeStudents(int id, String firstName, String lastName, String[] courses, String hostelastName, int year) {

        super(id, firstName, lastName, courses);
        this.hostelastName = hostelastName;
        this.year = year;
    }

    public String getHostelastName() {
        return hostelastName;
    }

    public void setHostelastName(String hostelastName) {
        this.hostelastName = hostelastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
