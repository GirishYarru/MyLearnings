package tEST.one.immutable1;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Age1 age = new Age1();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(2020);
		Employee1 emp = new Employee1("aaa", 1, age);
		System.out.println(emp.getEmpAge().getYear());

		age.setYear(2222);
		System.out.println(emp.getEmpAge().getYear());

		

	}

}
