package com.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "employee_many_to_many")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	private String empName;

	@JoinTable(name = "employee_department", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = {
			@JoinColumn(name = "dept_id") })
	private Set<Department> departments;

	public Employee() {

	}

	public int getId() {
		return empId;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

}
