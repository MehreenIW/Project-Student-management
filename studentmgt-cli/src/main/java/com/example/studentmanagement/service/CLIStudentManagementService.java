package com.example.studentmanagement.service;

import com.example.studentmanagement.CLI.CLI;
import com.example.studentmanagement.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@Profile("cli")
public class CLIStudentManagementService implements StudentManagementService {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public CLI cli;

    @Override
    public void start() {
        boolean cond = true;
        do {

            handlePrintMenu();
            Scanner keyboard = getScanner();
            int userInput = keyboard.nextInt();
            switch (userInput) {
                case 0 -> exitMenu();
                case 1 -> handleNewStudent();
                case 2 -> handleListStudents();
                case 3 -> handleGetStudent();
                case 4 -> handleDeleteStudent();
            }
        } while (cond);

    }

    public void handlePrintMenu() {
        cli.printmenu();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void exitMenu() {
        System.exit(0);
    }

    public void handleNewStudent() {
        Student newStudent = cli.addNewStudent();
        studentRepository.addStudent(newStudent);
        System.out.println("Record added successfully");
    }

    public void handleListStudents() {
        cli.listStudents();
        System.out.println(studentRepository.listStudent());
    }


    public void handleGetStudent() {
        int id = cli.getStudent();
        System.out.println(studentRepository.getStudent(id));
    }

    public void handleDeleteStudent() {
        int id = cli.deleteStudent();
        studentRepository.deleteStudentId(id);
        System.out.println("Record deleted successfully");
    }
}


