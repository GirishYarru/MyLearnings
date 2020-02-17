package com.helloworld;

public class PrimitiveArraySetterInjection {
	private String[] names;
	
	public PrimitiveArraySetterInjection() {
		System.out.println("in default constructor");
	}
	

	public PrimitiveArraySetterInjection(String[] names) {
		super();
		for(String str : names) {
			//System.out.println(str);
		}
		this.names = names;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	

}
