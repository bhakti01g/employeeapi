package com.practice.employee_management_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.employee_management_api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
}
