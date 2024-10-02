package com.practice.employee_management_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.employee_management_api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private final EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
}
