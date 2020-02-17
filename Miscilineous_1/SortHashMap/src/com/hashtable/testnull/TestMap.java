package com.hashtable.testnull;

import java.util.HashMap;
import java.util.Hashtable;

public class TestMap {
	public static void main(String[] args) {
		Hashtable<Integer, String> hTable = new Hashtable<>();
		//hTable.put(1, null);
		//System.out.println(hTable);
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, null);
		System.out.println(hMap.get(2));
		System.out.println(hMap.get(1));

		
	}

}
