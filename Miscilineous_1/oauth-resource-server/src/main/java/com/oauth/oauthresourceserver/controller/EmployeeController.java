package com.oauth.oauthresourceserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oauth.oauthresourceserver.model.Employee;

@RestController
public class EmployeeController {
	
@RequestMapping(value="/user/getEmployeeList")
	public List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("1", "sandhya"));
		empList.add(new Employee("2", "shweta"));
		return empList;
	}

}
