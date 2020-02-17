package com.helloworld;

import java.util.ArrayList;

public class SpecificDataType {
	private ArrayList<String> specificNames;

	
	public SpecificDataType(ArrayList<String> specificNames) {
		super();
		this.specificNames = specificNames;
	}

	public ArrayList<String> getSpecificNames() {
		return specificNames;
	}

	public void setSpecificNames(ArrayList<String> specificNames) {
		this.specificNames = specificNames;
	}
	
	public void printData() {
System.out.println(specificNames);
	}

}
