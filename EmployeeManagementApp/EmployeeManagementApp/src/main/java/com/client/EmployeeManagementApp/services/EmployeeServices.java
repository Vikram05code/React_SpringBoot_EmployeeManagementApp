package com.client.EmployeeManagementApp.services;

import com.client.EmployeeManagementApp.Model.Employee;

import java.util.List;

public interface EmployeeServices {

     public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(Integer empId);

    public Employee updateEmployeeById(Integer empId, Employee employee);

    public String deleteEmployeeById(Integer empId);

}