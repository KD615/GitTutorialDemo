package com.tothenew.entity;

public class Employee {
	
	private Long empID;
	private String firstName;
	private String lastName;
	
	public Long getEmpID() {
		return empID;
	}
	public void setEmpID(Long empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(Long empID, String firstName, String lastName) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
