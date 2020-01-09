package com.concurrentModification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification{
	public static void main(String[] args) throws CloneNotSupportedException {
//		List<String> list = new CopyOnWriteArrayList<String>();
//		list.add("1");
//		Iterator<String> itr = list.iterator();
//		System.out.println(list);
//
//		while (itr.hasNext()) {
//			String temp = itr.next();
//			list.add("2");
//			//itr.remove();
//		}
//		System.out.println(list);
		
		
		
		
		Employee e1 = new Employee(1, "abc");
		Employee e2 = e1.clone();
		e1.setName("shweta");
		System.out.println(e1.getName());
		System.out.println(e2.getName());

	}
	
	

	

}
