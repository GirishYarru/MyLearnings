package tEST.one.java8.comparable.comparator;

import java.util.Date;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private Date dateOfAdmission;
	private int age;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return rollNo + " " + age + " " + name + " " + dateOfAdmission;
	}

	@Override
	public int compareTo(Student o) {
		if(this.getAge()==o.getAge()) {
			return this.getName().compareTo(o.getName());
		}
		return this.getAge()-o.getAge();
	}

}
