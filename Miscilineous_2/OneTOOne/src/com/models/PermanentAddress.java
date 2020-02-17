package com.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_one_to_one")
public class PermanentAddress {
	@Id
	@Column(name = "add_id")
	@GeneratedValue
	private int addressID;
	@Column(name = "add_street")
	private String street;
	@Column(name = "add_state")
	private String state;
	@Column(name = "add_country")
	private String country;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_id")
	private Student student;
	
	

	public PermanentAddress() {
	}

	public PermanentAddress(int addressID, String street, String state, String country, Student student) {
		super();
		this.addressID = addressID;
		this.street = street;
		this.state = state;
		this.country = country;
		this.student = student;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return " [addressId: " + addressID + " street: " + street + " state: " + state + " country: " + country + " ]";
	}

}
