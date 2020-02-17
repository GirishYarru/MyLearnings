package com.test;

public final class HackerEarth {
	public static void compare(String str,String regex) {
		if(str.matches(regex))
			System.out.println(str+" matches");
		else {
			System.out.println(str+" did bnot match");
		}

	}

	public static void main(String[] args) {
//		int var1 = -4;
//		System.out.println(var1>>2);
//		int var2 = 4;
//		System.out.println(var2>>1);
		
//		HackerEarth.compare("Hacker@Earh.com", ".@.");
//		HackerEarth.compare("a@N", ".@.");
//		HackerEarth.compare("Java@Program", ".@.");
	//	System.out.println(7&6);

		double a = 290.5;
		int b =100;
		byte c = (byte)a;
		byte d = (byte)b;
		System.out.println(c+" "+d);
		
		
		

	}

}
