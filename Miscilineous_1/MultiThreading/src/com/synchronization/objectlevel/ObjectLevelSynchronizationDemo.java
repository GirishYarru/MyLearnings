package com.synchronization.objectlevel;

public class ObjectLevelSynchronizationDemo {

	public static void main(String[] args) {
		// Here display object is common for both threads
		// If we don't use synchronized keyword in Display class you will get mixed
		// output
		// Also try rremoving synchrinized keyword for printMethod in Display class
		System.out.println("**** Scenario 1 ******");
		Display display = new Display();
		Display display1 = new Display();
		ObjectLevelSynchronization objSync1 = new ObjectLevelSynchronization(display, "Dhoni");
		objSync1.start();
		ObjectLevelSynchronization objSync2 = new ObjectLevelSynchronization(display1, "Kohli");
		objSync2.start();


	}

}
