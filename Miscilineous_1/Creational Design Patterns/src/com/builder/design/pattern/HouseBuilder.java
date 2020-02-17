package com.builder.design.pattern;

public interface HouseBuilder {
	HouseBuilder buildFloor();

	HouseBuilder buildWall();

	HouseBuilder buildRoof();

	House build();
}
