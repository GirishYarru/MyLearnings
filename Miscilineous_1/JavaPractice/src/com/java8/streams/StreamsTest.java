package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamsTest {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("111");
		strList.add("444");
		strList.add("333");
		strList.add("222");
		
		//1)Filter - return type Stream
		List<String> resultList = strList.stream().filter(str->!str.equals("ddd")).collect(Collectors.toList());
		System.out.println(resultList);
		
		//2)map
		//convert all string to integer in list
		List<Double> intList = strList.stream().map(e->Double.valueOf(e)).collect(Collectors.toList());
		System.out.println(intList);
		//System.out.println(Boolean.valueOf("true"));
		
		DoubleStream doubleStream = strList.stream().mapToDouble(e->Double.valueOf(e));
		//doubleStream.
		
		//3)flatMap() - 
		System.out.println(strList.stream().map(e->Double.valueOf(e)).mapToDouble(e->2).average());
		
		System.out.println(strList.stream().limit(10).collect(Collectors.toList()));



		
	}

}
