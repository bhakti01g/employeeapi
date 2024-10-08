package com.practice.employee_management_api.exception;

import java.io.Serial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 3033803321404627494L;
	
	public EmployeeNotFound (String message) {
		super(message);
	}

}
