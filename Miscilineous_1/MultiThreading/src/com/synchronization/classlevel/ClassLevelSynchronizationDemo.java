package com.synchronization.classlevel;

public class ClassLevelSynchronizationDemo {

	public static void main(String[] args) {
		//Here display object is common for both threads
		//If we don't use synchronized keyword in Display class you will get mixed output
		//Also try rremoving synchrinized keyword for printMethod in Display class 
		Display display = new Display();
		ClassLevelSynchronization objSync1 = new ClassLevelSynchronization(display, "Dhoni");
		objSync1.start();
		ClassLevelSynchronization objSync2 = new ClassLevelSynchronization(display, "Kohli");
		objSync2.start();

	}

}
