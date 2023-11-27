package org.amreen.dto;

public class Department {
    private static int nextId = 1;

    private String id;
    private String departmentName;

    /**
     *
     * @param departmentName Name of the department
     */
    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", nextId=" + nextId +
                '}';
    }
}
