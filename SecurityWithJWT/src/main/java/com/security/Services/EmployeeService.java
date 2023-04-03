package com.security.Services;

import com.security.Exceptions.EmployeeException;
import com.security.Model.Employee;

import java.util.Optional;

public interface EmployeeService {

    public Employee registerEmployee(Employee employee)throws  EmployeeException;

    public Employee getEmployeeDetails(String email) throws EmployeeException;




}
