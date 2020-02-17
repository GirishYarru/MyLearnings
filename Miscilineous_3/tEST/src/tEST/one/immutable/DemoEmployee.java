package tEST.one.immutable;

public class DemoEmployee {

	public static void main(String[] args) {
//		Age age = new Age();
//		age.setDay(2);
//		age.setMonth(3);
//		age.setYear(1995);
//
//		Employee emp = new Employee("mindtree", 1, age);
//		System.out.println(emp.getEmpAge().getYear());
//		age.setYear(11);
//		System.out.println(emp.getEmpAge().getYear());
//		emp.getEmpAge().setYear(0);
//		System.out.println(emp.getEmpAge().getYear());
		String s1 = new String("sandhya");
		String s2 = new String("sandhya");
		String s3 = s1.intern();
		String s4 = "sandhya";
		
		System.out.println(s4==s3);
		
		System.out.println(s2.substring(0,-2));

//
}

}
