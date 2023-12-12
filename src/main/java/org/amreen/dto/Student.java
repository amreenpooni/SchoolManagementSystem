package org.amreen.dto;

import lombok.Data;

/**
 * @author Amreen Kaur Pooni
 * Student class
 */
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
     * Student info
     * @param lastName   Last name of the student
     * @param firstName  First name of the student
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

    /**
     * Adds course to student
     * @param courseName Course name
     */
    public void addCourse(Course courseName) {
        if (courses == null) {
            courses = new Course[MAX_COURSE_NUM]; // Assuming MAX_COURSES is a constant or a variable representing the maximum number of courses
        }

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = courseName;
                break;
            }
        }
    }

    /**
     * Changes to string and ignores null
     * @return Modified string
     */
    @Override
    public String toString() {
        String departmentInfo = (department != null) ? department.toString() : " ";

        StringBuilder coursesInfo = new StringBuilder("[");
        if (courses != null) {
            for (Course course : courses) {
                if (course != null) {
                    coursesInfo.append(course.getCourseName()).append(", ");
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
