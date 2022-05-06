package com.tothenew.bean;

import com.tothenew.entity.Employee;

public class AjaxBean {

	public Employee fetchEmployee() {
		return new Employee(1L, "Kuldeep", "Singh");
	}
	
	public Address fetchAddress() {
		return new Address();
	}
	
}
