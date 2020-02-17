package com.creatingThread;

public class Employee extends Thread{
	@Override
	public void run() {
       System.out.println("Child Thread created");
	}

}
