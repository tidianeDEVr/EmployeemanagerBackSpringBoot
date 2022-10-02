package com.tidianedevr.employeemanager.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.tidianedevr.employeemanager.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}