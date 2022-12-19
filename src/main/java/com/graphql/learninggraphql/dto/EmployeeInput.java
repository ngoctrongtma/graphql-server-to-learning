package com.graphql.learninggraphql.dto;


import java.util.UUID;

public class EmployeeInput {
    private String name, salary;
    private Integer departmentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public EmployeeInput(String name, String salary, Integer departmentId) {
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public EmployeeInput() {
    }
}
