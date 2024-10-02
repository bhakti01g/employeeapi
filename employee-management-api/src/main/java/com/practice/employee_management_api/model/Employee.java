package com.practice.employee_management_api.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="employe_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -1615047244838209029L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Phone_No")
	private Long phone;
	
	@Column(name="Email_Id")
	private String email;
	
	@Column(name="Job_Title")
	private String jobTitle;
	
	@Column(name="Department_Name")
	private String department;
	

	
}
