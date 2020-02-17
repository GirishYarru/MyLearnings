package com.dp.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		MySingleTon instance = MySingleTon.getInstance();
		instance.printMessage();
	}

}
