package com.tidianedevr.employeemanager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tidianedevr.employeemanager.exceptions.UserNotFoundException;
import com.tidianedevr.employeemanager.models.Employee;
import com.tidianedevr.employeemanager.repositories.EmployeeRepo;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo ;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(
            () -> new UserNotFoundException("User "+ id + "not found ..." )
        );
    }
}
