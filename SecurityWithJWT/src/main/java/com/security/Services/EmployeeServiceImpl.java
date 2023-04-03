package com.security.Services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.Exceptions.EmployeeException;
import com.security.Model.Department;
import com.security.Model.Employee;
import com.security.Repository.DepartmentRepoaitory;
import com.security.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepoaitory departmentRepoaitory;



    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
        employee.getDepartment().getEmployees().add(employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeDetails(String email) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeRepository.findByEmail(email);
        if(optionalEmployee.isPresent()) return optionalEmployee.get();
        else throw  new EmployeeException("employee does not exits with the email :"+email);
    }
}
