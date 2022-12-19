package com.graphql.learninggraphql.dto;

import java.util.UUID;

public class SalaryInput {
    private UUID employeeId;
    private String salary;

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public SalaryInput(UUID employeeId, String salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public SalaryInput() {
    }
}
