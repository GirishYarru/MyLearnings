package com.immutable;

import java.util.HashMap;

public class Demo {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "hello");
		Employe emp = new Employe(1, "", map);
		System.out.println(emp.gethMap());
		
		map.put("2", "hai");
		System.out.println(emp.gethMap());

		
	}

}
