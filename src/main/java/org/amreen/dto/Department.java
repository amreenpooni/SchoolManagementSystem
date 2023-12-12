package org.amreen.dto;

import lombok.Data;

/**
 * @author Amreen Kaur Pooni
 * Department class
 */
@Data
public class Department {
    private static int nextId = 1;

    private String id;
    private String departmentName;

    /**
     * Department info
     * @param departmentName Name of the department
     */
    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    /**
     * Changes to string
     * @return Modified string
     */
    @Override
    public String toString() {
        return "Department{id='" + id + "', departmentName='" + departmentName + "'}";
    }
}
