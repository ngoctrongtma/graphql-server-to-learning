package com.graphql.learninggraphql.controller;


import com.graphql.learninggraphql.dto.EmployeeInput;
import com.graphql.learninggraphql.dto.SalaryInput;
import com.graphql.learninggraphql.model.Department;
import com.graphql.learninggraphql.model.Employee;
import com.graphql.learninggraphql.repository.DepartmentRepository;
import com.graphql.learninggraphql.repository.EmployeeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.function.Function;

@Controller
public class GraphqlController {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public GraphqlController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    Function<EmployeeInput, Employee> mapping = employeeInput -> {
        var employee = new Employee();
        employee.setName(employeeInput.getName());
        employee.setSalary(employeeInput.getSalary());
        employee.setDepartmentId(employeeInput.getDepartmentId());
        return employee;
    };

    //@SchemaMapping(typeName = "Mutation", field = "addEmployee")
    @MutationMapping
    public Employee addEmployee(@Argument EmployeeInput employeeInput){
        Employee employee = mapping.apply(employeeInput);
        return this.employeeRepository.save(employee);
    }

    @MutationMapping
    public Employee updateSalary(@Argument SalaryInput salaryInput){
        return this.employeeRepository.updateSalary(salaryInput);
    }

    @QueryMapping
    public List<Employee> employeeByName(@Argument String employeeName){
        return this.employeeRepository.getEmployeeByName(employeeName);
    }

    @QueryMapping
    public List<Department> allDepartment(){
        return this.departmentRepository.findAll();
    }
}
