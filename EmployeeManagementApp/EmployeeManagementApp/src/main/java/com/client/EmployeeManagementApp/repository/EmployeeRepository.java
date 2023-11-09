package com.client.EmployeeManagementApp.repository;

import com.client.EmployeeManagementApp.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
