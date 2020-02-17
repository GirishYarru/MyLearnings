package com.eureka.producerservicediscovery.model;

import java.io.Serializable;

public class EmployeeProducer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String designation;
	private String company;

	public EmployeeProducer(String name, String designation, String company) {
		super();
		this.name = name;
		this.designation = designation;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
