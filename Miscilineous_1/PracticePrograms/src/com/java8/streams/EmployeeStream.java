package com.java8.streams;

public class EmployeeStream implements Comparable<EmployeeStream>{
	private int id;
	private String name;

	public EmployeeStream(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(EmployeeStream o) {
		return this.id - o.getId();
	}

}
