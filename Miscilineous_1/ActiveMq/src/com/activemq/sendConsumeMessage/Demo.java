package com.activemq.sendConsumeMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		String text ="The lines are printed in reverse order.";
		
		String[] str = text.toLowerCase().split(" ");
		str[str.length-1]=str[str.length-1].substring(0,str[str.length-1].length()-1);
		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
//		list.remove(list.size()-1);
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1.length()-o2.length());
			}
		});
		System.out.println(list);
		
		String result="";
		for(String strList: list) {
			result=result+" "+strList;
			
		}
		
		String finalResult = result.trim();
		System.out.println(finalResult.substring(0,1).toUpperCase()+finalResult.substring(1)+".");
		System.out.println(str[str.length-1].substring(0,str[str.length-1].length()-1));
	}

}
