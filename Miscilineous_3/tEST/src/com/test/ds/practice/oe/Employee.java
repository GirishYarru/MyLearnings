package com.test.ds.practice.oe;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

@Override
public String toString() {
	return "{ id  : "+id+" name : "+name+" }";
}
	@Override
	public int compareTo(Employee o) {
		if(this.id == o.id) {
			return 0;
		}
		if(this.id <o.id) {
			return -1;
		}
		if(this.id >o.id) {
			return 1;
		}
		return -1;
	}
	

}
