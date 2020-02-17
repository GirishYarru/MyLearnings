package tEST.one.immutable;

public final class Employee {
	private final String empname;
	private final int id;
	private final Age empAge;

	public Employee(String empname, int id, Age empAge) {
		this.empname = empname;
		this.id = id;
		Age age = new Age();
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

	public Age getEmpAge() {
		Age age = new Age();
		age.setDay(empAge.getDay());
		age.setMonth(empAge.getMonth());
		age.setYear(empAge.getYear());
		return age;
	}

}
