package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashTableExample {
	
	public static void main(String[] args) {
		Hashtable<Integer, String> hTable = new Hashtable<>();
		hTable.put(1, "a");
		hTable.put(2, "b");
		hTable.put(3, "c");
		hTable.put(4, "d");
		hTable.keySet().iterator();
		
		Enumeration<Integer> enumKeys = hTable.keys();
		while(enumKeys.hasMoreElements()) {
			System.out.println(enumKeys.nextElement());
			hTable.put(5, "e");
		}
		
		//System.out.println(hTable);
		TreeMap<String,String> set = new TreeMap<>();
		set.put("a","a");
		set.put("b","b");
		set.put("c","c");
		set.put("a","a");
		System.out.println(set);
		
	}

}
