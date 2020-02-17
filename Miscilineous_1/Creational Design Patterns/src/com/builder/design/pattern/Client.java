package com.builder.design.pattern;

import javax.xml.parsers.DocumentBuilderFactory;

public class Client {
	public static void main(String[] args) {
		
		HouseBuilder builder = new ConcreteHouseBuilder();
		House house1 = builder.buildFloor().build();
		System.out.println(house1);
		HouseBuildDirector director = new HouseBuildDirector(builder);
		System.out.println(director.construct());
		
		System.out.println(String.valueOf(2));
		
		DocumentBuilderFactory.newInstance();
		
	}

}
