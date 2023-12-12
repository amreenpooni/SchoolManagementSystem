package org.amreen.dto;

import lombok.Data;

/**
 * @author Amreen Kaur Pooni
 * School Management System class
 */
@Data
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private Department[] departments;
    private int departmentNum = 0;
    private Student[] students;
    private int studentNum = 0;
    private Teacher[] teachers;
    private int teacherNum = 0;
    private Course[] courses;
    private int courseNum = 0;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Add a student based on their name and the name of their department
     * @param lastName     Last name of student
     * @param firstName    First name of student
     * @param departmentId Id of the department of the student
     */
    public void addStudent(String lastName, String firstName, String departmentId) {
        Department department = findDepartment(departmentId);
        if (studentNum < MAX_STUDENT_NUM) {
            students[studentNum] = new Student(lastName, firstName, department);
            System.out.println(students[studentNum++] + "successfully added! \n");
        } else {
            System.out.println("Max student reached, add a new student failed. \n");
        }
    }

    /**
     * Add a teacher based on their name and the name of their department
     * @param lastName     Last name of teacher
     * @param firstName    First name of teacher
     * @param departmentId Id of the department of the teacher
     */
    public void addTeacher(String lastName, String firstName, String departmentId) {
        Department department = findDepartment(departmentId);
        if (teacherNum < MAX_TEACHER_NUM) {
            teachers[teacherNum] = new Teacher(lastName, firstName, department);
            System.out.println(teachers[teacherNum++] + "successfully added! \n");
        } else {
            System.out.println("Max teacher reached, add a new teacher failed. \n");
        }
    }

    /**
     * Add a department based on the name
     * @param name Name of new department
     */
    public void addDepartment(String name) {
        if (departmentNum < MAX_DEPARTMENT_NUM) {
            departments[departmentNum] = new Department(name);
            System.out.println(departments[departmentNum++] + "successfully added! \n");
        } else {
            System.out.println("Max department reached, add a new department failed. \n");
        }
    }

    /**
     * Add a course
     * @param courseName   Name of the course
     * @param credit       Credit of the course
     * @param departmentId Id of the department of the course
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        Department department = findDepartment(departmentId);
        if (courseNum < MAX_COURSE_NUM) {
            courses[courseNum] = new Course(credit, department, courseName);
            System.out.println("Course" + courses[courseNum++] + "successfully added! \n");
        } else {
            System.out.println("Max course reached, add a new course failed. \n");
        }
    }

    /**
     * Display all students in a school
     */
    public void displayStudents() {
        System.out.println("Displaying all students:");
        System.out.println("------------------------");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * Display all teachers in a school
     */
    public void displayTeachers() {
        System.out.println("Displaying all teachers:");
        System.out.println("------------------------");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * Display all departments in a school
     */
    public void displayDepartment() {
        System.out.println("Displaying all departments:");
        System.out.println("---------------------------");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Display all courses in a school
     */
    public void displayCourses() {
        System.out.println("Displaying all courses:");
        System.out.println("------------------------");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * Search a student
     * @param studentId The student's ID
     * @return The student with matching ID, null if student does not exist
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null) {
                if (student.getId().equals(studentId)) {
                    return student;
                }
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
            if (teacher != null) {
                if (teacher.getId().equals(teacherId)) {
                    return teacher;
                }
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
            if (department != null) {
                if (department.getId().equals(departmentId)) {
                    return department;
                }
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
            if (course != null) {
                if (course.getId().equals(courseId)) {
                    return course;
                }
            }
        }
        return null;
    }

    /**
     * Assign a teacher to a specific course
     * @param teacherId The teacher's ID
     * @param courseId  The course's ID
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);
        if (teacher == null) {
            System.out.printf("Cannot find any teacher match with teacherId %s, modify teacher for course %s failed. \n",
                    teacherId, courseId);
            return;
        }
        if (course == null) {
            System.out.printf("Cannot find any course match with courseId %s, modify teacher for course %s failed. \n",
                    courseId, courseId);
            return;
        }
        course.setTeacher(teacher);
        System.out.printf("%s teacher info updated successfully. \n", course);
    }

    /**
     * Register a student to a course
     * @param studentId Student's ID
     * @param courseId  Course's ID
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student == null) {
            System.out.printf("Cannot find any student match with studentId %s, register course for student %s " +
                    "failed. \n", studentId, studentId);
        } else if (course == null) {
            System.out.printf("Cannot find any course match with courseId %s, register course for student %s " +
                    "failed. \n", courseId, studentId);
        } else if (student.getCourseNum() >= 5) {
            System.out.printf("Student %s has already registered 5 courses, register course for student %s failed." +
                    " \n", studentId, studentId);
        } else if (course.getStudentNum() >= 5) {
            System.out.printf("Course %s has been fully registered, register course %s for student %s failed. " +
                    "\n", courseId, courseId, studentId);
        } else if (registeredToCourse(student, course)) {
            System.out.printf("Student %s has already registered Course %s, register course %s for student %s " +
                    "failed. \n", studentId, courseId, courseId, studentId);
        } else {
            student.addCourse(course);
            course.addStudent(student);
            System.out.print("Student register course successfully \n");
            System.out.printf("Latest student info: %s \n", student);
            System.out.printf("Latest course info: %s \n", course);
        }
    }

    /**
     * Checks if student is registered to the course
     * @param student Student
     * @param course  Course
     * @return True or false
     */
    private boolean registeredToCourse(Student student, Course course) {
        for (Student registeredStudent : course.getStudents()) {
            if (registeredStudent != null && registeredStudent.equals(student)) {
                return true;
            }
        }
        return false;
    }
}
