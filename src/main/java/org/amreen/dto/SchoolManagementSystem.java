package org.amreen.dto;

import lombok.Data;
@Data
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Add a student based on their name and the name of their department
     * @param lastName Last name of student
     * @param firstName First name of student
     * @param departmentId Id of the department of the student
     */
    public void addStudent(String lastName, String firstName, String departmentId) {

    }

    /**
     * Add a teacher based on their name and the name of their department
     * @param lastName Last name of teacher
     * @param firstName First name of teacher
     * @param departmentId Id of the department of the teacher
     */
    public void addTeacher(String lastName, String firstName, String departmentId) {

    }

    /**
     * Add a department based on the name
     * @param name Name of new department
     */
    public void addDepartment(String name) {

    }

    /**
     * Add a course
     * @param courseName Name of the course
     * @param credit Credit of the course
     * @param departmentId Id of the department of the course
     */
    public void addCourse(String courseName, double credit, String departmentId) {

    }

    /**
     * Display all students in a school
     */
    public void displayStudents() {

    }

    /**
     * Display all teachers in a school
     */
    public void displayTeachers() {

    }

    /**
     * Display all departments in a school
     */
    public void displayDepartment() {

    }

    /**
     * Display all courses in a school
     */
    public void displayCourses() {

    }

    /**
     * Search a student
     * @param studentId The student's ID
     * @return The student with matching ID, null if student does not exist
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Search a teacher
     * @param teacherId The teacher's ID
     * @return The teacher with matching ID, null if teacher does not exist
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * Search a department
     * @param departmentId The department's ID
     * @return The department with matching ID, null if department does not exist
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department.getId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    /**
     * Search a course
     * @param courseId The course's ID
     * @return The course with matching ID, null if course does not exist
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course.getId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /**
     * Assign a teacher to a specific course
     * @param teacherId The teacher's ID
     * @param courseId The course's ID
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * Register a student to a course
     * @param studentId Student's ID
     * @param courseId Course's ID
     */
    public void registerCourse(String studentId, String courseId) {

    }
}
