package tEST.one.immutable1;

public class Employee1 {
	private final String empname;
	private final int id;
	private final Age1 empAge;

	public Employee1(String empname, int id, Age1 empAge) {
		this.empname = empname;
		this.id = id;
		Age1 age = new Age1();
		age.setDay(empAge.getDay());
		age.setMonth(empAge.getMonth());
		age.setYear(empAge.getYear());

		this.empAge = age;
	}

	public String getEmpname() {
		return empname;
	}

	public int getId() {
		return id;
	}

	public Age1 getEmpAge() throws CloneNotSupportedException {
		return (Age1) empAge.clone();
	}

}
