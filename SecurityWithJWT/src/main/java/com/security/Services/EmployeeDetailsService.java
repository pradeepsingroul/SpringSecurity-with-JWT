package com.security.Services;

import com.security.Model.Employee;
import com.security.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDetailsService implements UserDetailsService {
	
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Employee> optionalEmployee = employeeRepository.findByEmail(username);
        if(optionalEmployee.isPresent()){
            Employee employee = optionalEmployee.get();
            List<GrantedAuthority> authorities = new ArrayList<>();
            
            return new EmployeeDetails(employee);
//            return new User(employee.getEmail(),employee.getPassword(),authorities);
        }else throw new UsernameNotFoundException("user does not found with username :"+username);
    }
}
