package org.amreen.dto;

public class Teacher {
    private static int nextId = 1;

    private String lastName;
    private String firstName;
    private String id;
    private Department department;

    /**
     *
     * @param lastName Last name of teacher
     * @param firstName First name of teacher
     * @param department Teacher's department
     */
    public Teacher(String lastName, String firstName, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}
