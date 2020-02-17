package com.builder.design.pattern;

public class WoddenHouseBuilder implements HouseBuilder{
	
	private House house;
	
	

	public WoddenHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType("wood");
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWallType("wood");
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType("wood");
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}

