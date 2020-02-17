package com.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_one_to_one")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "stu_id")
	private int id;
	@Column(name = "stu_name")
	private String name;
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private PermanentAddress permanentAddress;

	public Student() {
	}

	public Student(int id, String name, PermanentAddress permanentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.permanentAddress = permanentAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Student [student id: " + id + " name: " + name + " Address: " + permanentAddress + " ]";
	}

}
