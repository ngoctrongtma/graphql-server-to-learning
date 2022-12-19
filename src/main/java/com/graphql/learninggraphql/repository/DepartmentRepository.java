package com.graphql.learninggraphql.repository;

import com.graphql.learninggraphql.model.Department;
import com.graphql.learninggraphql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
