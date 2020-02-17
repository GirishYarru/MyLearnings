package tEST.one.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private final int id;
	private final String name;
	private final Age age;
	public  static Date date;



	public Student(int id, String name, Age age,Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date=date;
//		Age cloneAge = new Age();
//		cloneAge.setDay(age.getDay());
//		cloneAge.setMonth(age.getMonth());
//		cloneAge.setYear(age.getYear());

		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	public Age getAge() {

		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());
		return cloneAge;
		// return age;
	}

	public static void main(String[] args) throws ParseException {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1992);
		Student student = new Student(1, "Alex", age,new Date());

		System.out.println("Alex age year before modification = " + student.getAge().getYear());

		age.setYear(1993);
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
		age.setYear(1995);
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
		student.getAge().setYear(0006);
		System.out.println("Alex age year after modification 11= " + student.getAge().getYear());
		System.out.println("-------date------");
		System.out.println("date = " + student.getDate());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		//Date d = 
		//date = sdf.parse("2019-07-09");
		
		System.out.println("date = " + student.getDate());




	}

}
