package com.classes;
import java.util.*;

public class StudentManagement {
    public static void removeLowGradeStudents(Set<Student> students){
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void promoteStudents(Set<Student> students){
        for(Student student : students ){
            if(student.getAverageGrade() >= 3){
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course){
        for(Student student : students){
            if(student.getCourse() == course)
            {
                System.out.println(student.getName());
            }
        }
    }
}
