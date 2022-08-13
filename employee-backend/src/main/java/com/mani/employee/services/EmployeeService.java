package com.mani.employeesystemapi.services;

import com.mani.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Boolean deleteEmployee(Long id);

    Employee getEmployeeByid(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
