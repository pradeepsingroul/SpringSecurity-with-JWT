package com.security.Services;

import com.security.Exceptions.DepartmentException;
import com.security.Model.Department;
import com.security.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface DepartmentServices {

    public Department registerDepartment(Department department)throws DepartmentException;

    public Department getDepartmentDetails(int departid) throws DepartmentException;





}
