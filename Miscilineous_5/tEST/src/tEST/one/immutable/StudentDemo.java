package tEST.one.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDemo {
	
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
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
		System.out.println("-------date------");
		System.out.println("date = " + student.getDate());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		//Date d = 
		//date = sdf.parse("2019-07-09");
		Student.date = sdf.parse("2019-07-09");
		
		student.setDate(sdf.parse("2010-07-2"));
		System.out.println("date = " + student.getDate());
		System.out.println(Student.date);





	
	}

}
