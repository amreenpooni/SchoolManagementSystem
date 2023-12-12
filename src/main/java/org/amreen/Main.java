package org.amreen;

import org.amreen.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
       SchoolManagementSystem schoolManagementSystem = getSchoolManagementSystem();

       schoolManagementSystem.modifyCourseTeacher("T001", "C001");
       schoolManagementSystem.modifyCourseTeacher("T009", "C003"); //should fail because teacher does not exist
       schoolManagementSystem.modifyCourseTeacher("T004", "C007"); //should fail because course does not exist

       schoolManagementSystem.registerCourse("S001", "C002");
       schoolManagementSystem.registerCourse("S009", "C003"); //should fail because student does not exist
       schoolManagementSystem.registerCourse("S004", "C007"); //should fail because course does not exist
       schoolManagementSystem.registerCourse("S001", "C001"); // student is fully registered
       schoolManagementSystem.registerCourse("S001", "C003");
       schoolManagementSystem.registerCourse("S001", "C004");
       schoolManagementSystem.registerCourse("S002", "C002");
       schoolManagementSystem.registerCourse("S002", "C006");
       schoolManagementSystem.registerCourse("S003", "C006");
       schoolManagementSystem.registerCourse("S004", "C006");
       schoolManagementSystem.registerCourse("S005", "C006");
       schoolManagementSystem.registerCourse("S001", "C002"); // should fail because student already registered
    }

   /**
    * Adds department, student, teacher, course, and displays them
    * @return department, student, teacher, and course
    */
   private static SchoolManagementSystem getSchoolManagementSystem() {
      SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

      schoolManagementSystem.addDepartment("Computer Science");
      schoolManagementSystem.addDepartment("Health Science");
      schoolManagementSystem.addDepartment("Business Administration");
      schoolManagementSystem.addDepartment("Media and Studio Arts");
      schoolManagementSystem.addDepartment("Psychology");

      schoolManagementSystem.displayDepartment();

      schoolManagementSystem.addStudent("Bensamed", "Lina", "D002");
      schoolManagementSystem.addStudent("Slimani", "Maria", "D001");
      schoolManagementSystem.addStudent("Huy", "Anny", "D004");
      schoolManagementSystem.addStudent("Pooni", "Amreen", "D005");
      schoolManagementSystem.addStudent("Elaiappah", "Shagini", "D003");

      schoolManagementSystem.displayStudents();

      schoolManagementSystem.addTeacher("Yoo", "Joonghyuk", "D001");
      schoolManagementSystem.addTeacher("Kim", "Dokja", "D002");
      schoolManagementSystem.addTeacher("Moretti", "Klein", "D005");
      schoolManagementSystem.addTeacher("Gray", "Dorian", "D004");
      schoolManagementSystem.addTeacher("Han", "Sooyoung", "D003");

      schoolManagementSystem.displayTeachers();

      schoolManagementSystem.addCourse("Intro to Programming", 3, "D001");
      schoolManagementSystem.addCourse("General Chemistry", 3, "D002");
      schoolManagementSystem.addCourse("Accounting", 2, "D003");
      schoolManagementSystem.addCourse("Photography", 2, "D004");
      schoolManagementSystem.addCourse("Intro to Psychology", 3, "D005");

      schoolManagementSystem.displayCourses();
      return schoolManagementSystem;
   }
}
