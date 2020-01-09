package com.concurrentModification;

public class Employee implements Cloneable{
	private int id;
	private String name;

	Employee(int id, String name) {
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
protected Employee clone() throws CloneNotSupportedException {
	return (Employee) super.clone();
}

}
