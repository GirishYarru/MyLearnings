package com.creatingThread;

public class Demo {

	public static void main(String[] args) {
		System.out.println("1)*******Thread creation using extends keyword ***");
		Employee emp = new Employee();
		emp.start();
		System.out.println("2)*******Thread creation using implements keyword ***");
		EmployeeRunnable run = new EmployeeRunnable();
		Thread t = new Thread(run);
		t.start();

	}

}
