package tEST.one.java8.comparable.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Student st1 = new Student(1,18,"ayush");
		Student st2 = new Student(1,18,"ayush");
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		//---age
		Collections.sort(list);
		
		//--name
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return -(o1.getRollNo()-o2.getRollNo());
			}
			
		});
		
		System.out.println(list);
		//---name
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		
		System.out.println(list);
		
		
		Set<Student> setList = new HashSet<>();
		setList.add(st1);
		setList.add(st2);

		System.out.println("***** size is "+setList.size());
		
		///-------integers---
		Set<Integer> setIntList= new HashSet<>();
		setIntList.add(1);
		setIntList.add(1);
		
		System.out.println(setIntList.size()+" setIntList");
		
		Set<Integer> setIntList1= new HashSet<>();
		int a =1;
		int b =1;
		setIntList1.add(a);
		setIntList1.add(b);
		
		System.out.println(setIntList1.size()+" setIntList1");

		
		
		

		

		
		
		
		

		
		
		

		

	}

}
