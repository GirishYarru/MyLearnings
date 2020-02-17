package com.immutable;

import java.util.HashMap;

public final class Employe {
	private final int id;
	private final String name;
	private final HashMap<String, String> hMap;
	
	public Employe(final int id,final String name, final HashMap<String, String> hMap) {
		this.id = id;
		this.name = name;
		this.hMap = (HashMap<String, String>) hMap.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> gethMap() {
		return (HashMap<String, String>) hMap.clone();
	}
	
	
	

}
