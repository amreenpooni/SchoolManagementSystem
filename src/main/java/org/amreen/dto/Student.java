package org.amreen.dto;

import lombok.Data;

import java.util.Arrays;
@Data
public class Student {
    public static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    private String firstName;
    private String lastName;
    private String id;
    private int courseNum;
    private Course[] courses;
    private Department department;

    /**
     *
     * @param lastName Last name of the student
     * @param firstName First name of the student
     * @param department Department of the student
     */
    public Student(String lastName, String firstName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUM];
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", nextId=" + nextId +
                ", courseNum=" + courseNum +
                ", courses=" + Arrays.toString(courses) +
                ", department=" + department +
                '}';
    }
}
