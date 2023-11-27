package org.amreen.dto;

import java.util.Arrays;

public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private static int nextId = 1;

    private String courseName;
    private String id;
    private double credit;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;

    /**
     *
     * @param credit Credits of course
     * @param department Department of the course
     * @param courseName The course's name
     */
    public Course(double credit, Department department, String courseName) {
        this.credit = credit;
        this.id = String.format("C%03d", nextId++);
        this.department = department;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", id='" + id + '\'' +
                ", credit=" + credit +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                '}';
    }
}
