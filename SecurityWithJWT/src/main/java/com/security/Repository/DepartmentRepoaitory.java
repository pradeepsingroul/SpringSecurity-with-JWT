package com.security.Repository;

import com.security.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepoaitory extends JpaRepository<Department,Integer> {




}
