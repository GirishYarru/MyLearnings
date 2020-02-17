package tEST.one.pass.by.value;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPassByValue {
	
	public static Student chnageValue(Student st) {
		//st  = new Student(2, "yarru");
		st.setName("yarru");
		st.setRollNo(2);
		st.setDate(new Date(1435221556000L));
		return st;
	}

	public static void main(String[] args) throws ParseException {
		Student st = new Student(1,"girish");
		System.out.println(st.getName());
		Student st1 = chnageValue(st);
		System.out.println("***");
		System.out.println(st1.getName()+" New");
		System.out.println(st.getName()+" Old");
		System.out.println("----date-----");
//		Student stDate1 = new Student(3, "before date");
//		stDate1.setDate(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d = format.parse("2014-02-14");
		st1.setDate(d);
		System.out.println(st1.getDate());
		Date d1= new Date(1435221556000L*1000);
		Date d2 = new Date();
		System.out.println(d2);
		d2.getTime();
		System.out.println(d2.getTime());

		

	}

}
