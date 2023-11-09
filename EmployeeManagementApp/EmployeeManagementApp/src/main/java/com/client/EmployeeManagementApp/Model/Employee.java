package com.client.EmployeeManagementApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int employeeId;
  private String empName;
  private String empEmail;
  private String empContact;
  private String empAddress;
  private String empSalary;



}
