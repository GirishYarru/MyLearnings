package com.spring;

public class HelloWorld {
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private HelloWorld(String name,int i,String mail) {
		this.name=name;
		System.out.println("Inside constructor");
	}
	
	private String name;
	
	public void printMessage() {
	}

}
