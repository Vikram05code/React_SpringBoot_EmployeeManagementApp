package com.client.EmployeeManagementApp.controller;

import com.client.EmployeeManagementApp.Model.Employee;
import com.client.EmployeeManagementApp.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
   private EmployeeServices employeeServices;

    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

       Employee addedEmployee = employeeServices.addEmployee(employee);

        return new ResponseEntity<>(addedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getEmployeeList(){
        List<Employee> employeeList = employeeServices.getAllEmployee();

        return new ResponseEntity<>(employeeList, HttpStatus.OK);

    }

    @GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId){

       Employee employee = employeeServices.getEmployeeById(empId);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping ("/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer empId, @RequestBody Employee employee){
          Employee updatedEmployee = employeeServices.updateEmployeeById(empId, employee);

        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId){
       String msgs = employeeServices.deleteEmployeeById(empId);

        return new ResponseEntity<>(msgs, HttpStatus.OK);
    }

}
