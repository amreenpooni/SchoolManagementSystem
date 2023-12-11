package org.amreen.dto;

import lombok.Data;

import java.util.Arrays;
@Data
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
        this.id = String.format("C%03d", nextId++);
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENT_NUM];
        this.credit = credit;
        this.department = department;
    }

    public void addStudent(Student student) {
        students[studentNum++] = student;
    }

    @Override
    public String toString() {
        String teacherInfo = (teacher != null) ? teacher.toString() : " ";
        String departmentInfo = (department != null) ? department.toString() : " ";

        StringBuilder studentsInfo = new StringBuilder("[");
        if (students != null) {
            for (Student student : students) {
                if (student != null) {
                    studentsInfo.append(student.getFirstName()).append(", ");
                }
            }
        }
        studentsInfo.append("]");

        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", teacher=" + teacherInfo +
                ", department='" + departmentInfo + '\'' +
                ", students=" + studentsInfo +
                '}';
    }
}
