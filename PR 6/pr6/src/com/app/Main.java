package com.app;
import com.classes.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("John Doe", "A1", 2, Arrays.asList(4, 5, 3)));
        students.add(new Student("Jane Smith", "B2", 2, Arrays.asList(2, 3, 1)));
        students.add(new Student("Jim Brown", "C3", 3, Arrays.asList(5, 4, 5)));
        students.add(new Student("Anna White", "D4", 1, Arrays.asList(3, 3, 3)));

        System.out.println("All students :");
        students.forEach(System.out::println);

        StudentManagement.removeLowGradeStudents(students);
        System.out.println("\nAfter removing students with average grade < 3:");
        students.forEach(System.out::println);

        StudentManagement.promoteStudents(students);
        System.out.println("\nAfter promoting students with average grade >= 3:");
        students.forEach(System.out::println);

        System.out.println("\nStudents on course 3:");
        StudentManagement.printStudents(students, 3);
    }
}