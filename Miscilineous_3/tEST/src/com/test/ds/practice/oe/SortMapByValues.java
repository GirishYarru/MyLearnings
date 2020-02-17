package com.test.ds.practice.oe;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		Map<StringBuffer, Integer> hMap1 = new HashMap<StringBuffer, Integer>();

		hMap.put("A", 20);
		hMap.put("B", 10);
		hMap.put("C", 60);
		hMap.put("D", 50);
		hMap.put("E", 5);
		hMap.put("F", 0);
		List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(hMap.entrySet()); 
	      Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
		
		

	}

}
