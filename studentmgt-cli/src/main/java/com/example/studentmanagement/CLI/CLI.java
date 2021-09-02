package com.example.studentmanagement.CLI;

import com.example.studentmanagement.FullTimeStudents;
import com.example.studentmanagement.PartTimeStudents;
import com.example.studentmanagement.Student;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CLI {

    Scanner keyboard = new Scanner(System.in);

    public void printmenu() {
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("Choose the option :");
        System.out.println("0 - Exit ");
        System.out.println("1 - Add New Student");
        System.out.println("2 - List Students :");
        System.out.println("3 - View Student Details :");
        System.out.println("4 - Delete Student:");
    }

    public Student addNewStudent() {

        System.out.println("Enter the details of the student");
        System.out.println("New Student ID : ");

        int newId = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("First Name : ");
        String firstname = keyboard.nextLine();

        System.out.println("Last Name : ");
        String lastname = keyboard.nextLine();

        System.out.println("Courses (max 4): ");
        String[] courses = new String[4];
        for (int j = 0; j < courses.length; j++) {
            courses[j] = keyboard.nextLine();
        }

        System.out.println("Enter 1 for Full-time and 2 for Part-time : ");
        int type = keyboard.nextInt();
        keyboard.nextLine();

        if (type == 1) {
            System.out.println("Hostel Name : ");
            String hostelName = keyboard.nextLine();

            System.out.println("Year : ");
            int year = keyboard.nextInt();


            return new FullTimeStudents(newId, firstname, lastname, courses, hostelName, year);

        } else {

            System.out.println("Level : ");
            int level = keyboard.nextInt();

            System.out.println("Working (True/False): ");
            boolean working = keyboard.nextBoolean();

            return new PartTimeStudents(newId, firstname, lastname, courses, level, working);
        }

    }

    public void listStudents() {
        System.out.println("List of Students :");
    }


    public int getStudent() {
        System.out.println("Enter the id of the student to get details : ");
        return (keyboard.nextInt());
    }

    public int deleteStudent() {
        System.out.println("Enter the id of the student : ");
        return (keyboard.nextInt());

    }
}
