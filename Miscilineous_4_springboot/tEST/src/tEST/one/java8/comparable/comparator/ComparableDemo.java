package tEST.one.java8.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student student1 = new Student();
		student1.setAge(18);
		student1.setRollNo(1);
		student1.setName("dbc");
		//student1.setDateOfAdmission(dateOfAdmission);
		
		Student student2 = new Student();
		student2.setAge(18);
		student2.setRollNo(4);
		student2.setName("bca");
		
		Student student3 = new Student();
		student3.setAge(20);
		student3.setRollNo(3);
		student3.setName("cab");
		
		Student student4 = new Student();
		student4.setAge(21);
		student4.setRollNo(2);
		student4.setName("acb");
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		Collections.sort(studentList);
		System.out.println(studentList);
		
		
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
			
		});

		

		

	}

}
