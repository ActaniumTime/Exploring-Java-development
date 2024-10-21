package com.classes;
import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(){
        this.name = "";
        this.group = "";
        this.course = 0;
        this.grades = Collections.singletonList(0);
    }

    public Student(String Name, String Group, int Course, List<Integer> Grades){
        this.name = Name;
        this.group = Group;
        this.course = Course;
        this.grades = Grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void promoteToNextCourse(){
        this.course++;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", averageGrade=" + getAverageGrade() +
                '}';
    }



}
