package com.helloworld;

public class HelloWorld {
	private Name name;
	
	private HelloWorld(Name i,String s) {
		//System.out.println(name);
		System.out.println("in hello worlds constr"+ i.getName() + " STring "+ s);
	}
	
	public void printMessage() {
		System.out.println("Hello hai"+name.getName());
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
