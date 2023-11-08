package com.client.EmployeeManagementApp.services;

import com.client.EmployeeManagementApp.Model.Employee;

import java.util.List;

public interface EmployeeServices {

     public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(String empId);

    public Employee updateEmployeeById(String empId, Employee employee);

    public String deleteEmployeeById(String empId);

}