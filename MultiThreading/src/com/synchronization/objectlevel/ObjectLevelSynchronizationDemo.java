package com.synchronization.objectlevel;

public class ObjectLevelSynchronizationDemo {

	public static void main(String[] args) {
		// Here display object is common for both threads
		// If we don't use synchronized keyword in Display class you will get mixed
		// output
		// Also try rremoving synchrinized keyword for printMethod in Display class
		System.out.println("**** Scenario 1 ******");
		Display display = new Display();
		ObjectLevelSynchronization objSync1 = new ObjectLevelSynchronization(display, "Dhoni");
		objSync1.start();
		ObjectLevelSynchronization objSync2 = new ObjectLevelSynchronization(display, "Kohli");
		objSync2.start();

		System.out.println("**** Scenario 2 ******");
		// comment the above scenario before executing this
		// Here you will get mixed output because of two differnt display objects.
		// In this case you can go for Class level synchronization.
		Display display1 = new Display();
		Display display2 = new Display();
		ObjectLevelSynchronization objSync3 = new ObjectLevelSynchronization(display1, "Pant");
		objSync3.start();
		ObjectLevelSynchronization objSync4 = new ObjectLevelSynchronization(display2, "Saha");
		objSync4.start();

	}

}
