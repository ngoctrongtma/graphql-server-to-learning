package com.graphql.learninggraphql.repository;

import com.graphql.learninggraphql.dto.SalaryInput;
import com.graphql.learninggraphql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(
            value = "SELECT * FROM employee u WHERE u.name = ?1",
            nativeQuery = true)
    List<Employee> getEmployeeByName(String name);

    @Modifying
    @Query("update Employee e set e.salary = :salaryInput")
    Employee updateSalary(@Param("salaryInput") SalaryInput salaryInput);
}


