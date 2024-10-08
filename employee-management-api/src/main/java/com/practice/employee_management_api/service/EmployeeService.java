package com.practice.employee_management_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.employee_management_api.exception.EmployeeNotFound;
import com.practice.employee_management_api.model.Employee;
import com.practice.employee_management_api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	public List<Employee> findAllemployees() {
		
		return employeeRepository.findAll();
	}

	public Employee findEmployeeById(Long id) {
		return employeeRepository.findEmployeeById(id)
				.orElseThrow(()-> new EmployeeNotFound
				("Employee by id "+id+" was not found"));
	}

	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Long id) {
		Employee existingEmployee = this.employeeRepository.findById(id)
				.orElseThrow(()-> new EmployeeNotFound
						("Employee by id "+id+" was not found"));
		this.employeeRepository.delete(existingEmployee);
		
	}
}
