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
        this.courseNum = 0;
    }

    @Override
    public String toString() {
        String departmentInfo = (department != null) ? department.toString() : " ";

        StringBuilder coursesInfo = new StringBuilder("[");
        if (courses != null) {
            for (Course course : courses) {
                if (course != null) {
                    coursesInfo.append(course).append(", ");
                }
            }
        }
        coursesInfo.append("]");

        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + firstName + '\'' +
                ", lname='" + lastName + '\'' +
                ", department=" + departmentInfo +
                ", courseNum=" + courseNum +
                ", courses=" + coursesInfo +
                '}';
    }
}
