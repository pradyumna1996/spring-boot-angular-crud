package com.prad.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	
	@Column(name="emp_first_name")
	private String empFirstName;
	
	@Column(name="emp_last_name")
	private String empLastName;

	@Column(name="emp_email_id")
	private String empEmailId;
	
	
	public Employee() {
		
	}
	
	public Employee(String empFirstName, String empLastName, String empEmailId) {
		super();
		
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailId = empEmailId;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	
	
	
	
}
