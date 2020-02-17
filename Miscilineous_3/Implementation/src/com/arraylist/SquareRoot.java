package com.arraylist;

public class SquareRoot {
	
	public static void powerOfNumber(int num1,int num2) {
		long temp=1;
		int result=1;
for(int base=1;base<num1/2;base++) {
	
	for(int exp=1;exp<=num1/2;exp++) {
		for(int i=1;i<=num1/2;i++) {
			result=result*base;
			if(result>base)
				continue;
			
		}

	}
	
	
}

System.out.println(result);
		
	}

	public static void main(String[] args) {
		powerOfNumber(25,30);

	}

}
