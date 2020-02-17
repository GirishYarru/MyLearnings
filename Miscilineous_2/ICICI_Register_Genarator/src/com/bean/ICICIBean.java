package com.bean;

public class ICICIBean {
	private String accNo;
	private String name;
	private String email;
	private long phone;
	private int balance;

	public ICICIBean() {
	}

	public ICICIBean(String accNo, String name, String email, long phone, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
