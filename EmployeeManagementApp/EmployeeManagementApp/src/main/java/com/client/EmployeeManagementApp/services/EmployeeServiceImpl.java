package com.client.EmployeeManagementApp.services;

import com.client.EmployeeManagementApp.Exceptions.ResourceNotFoundExceptions;
import com.client.EmployeeManagementApp.Model.Employee;
import com.client.EmployeeManagementApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){

       Employee newEmployee = employeeRepository.save(employee);

        return newEmployee;
    }

    @Override
    public List<Employee> getAllEmployee() {
       List<Employee> employeeList = employeeRepository.findAll();

        return employeeList;
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        Employee employee = employeeRepository.findById(empId).orElseThrow(() -> new ResourceNotFoundExceptions("Employee with given id is not found! "+empId));
        return employee;
    }

    @Override
    public Employee updateEmployeeById(Integer empId, Employee employee) {

        Employee employee1 = employeeRepository.findById(empId).orElseThrow(() -> new ResourceNotFoundExceptions("Employee with given id is not found! "+empId));
        employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public String deleteEmployeeById(Integer empId) {
        Employee employee1 = employeeRepository.findById(empId).orElseThrow(() -> new ResourceNotFoundExceptions("Employee with given id is not found! "+empId));
        employeeRepository.delete(employee1);
        return "Employee successfully deleted with id: "+empId;
    }
}
