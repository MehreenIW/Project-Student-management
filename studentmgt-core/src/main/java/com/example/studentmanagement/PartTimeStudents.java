package com.example.studentmanagement;

import java.util.Arrays;

public class PartTimeStudents extends Student {

    private int level;
    private boolean workStatus;


    public PartTimeStudents(int id, String firstName, String lastName, String[] courses, int level, boolean workStatus) {

        super(id, firstName, lastName, courses);
        this.level = level;
        this.workStatus = workStatus;
    }


    @Override
    public String toString() {
        return "PartTimeStudent : {" +
                "Student Id =" + studentId +
                ", First Name ='" + firstName +
                ", Last Name ='" + lastName +
                ", Level ='" + level + '\'' +
                ", Working ='" + workStatus + '\'' +
                ", Courses =" + Arrays.toString(courses) +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWorkStatus(boolean workStatus) {
        this.workStatus = workStatus;
    }

    public boolean isWorkStatus() {
        return workStatus;
    }
}
