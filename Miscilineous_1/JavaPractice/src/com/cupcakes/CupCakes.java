package com.cupcakes;

public class CupCakes {
	public static void findCupCakes() {
		int dollars = 10;
		int cupCakePrice = 2;
		int wrappers = 2;
		int noOfCakes = dollars/cupCakePrice;
		int noOfWrappers = noOfCakes/wrappers+((noOfCakes- noOfCakes/wrappers)- noOfCakes/wrappers);
		noOfWrappers= noOfWrappers/2;
		
		
	}
	public static void main(String[] args) {
		int count =0;
		int cakes = 5;
		
		while((cakes/2+(cakes-cakes/2)-cakes/2)>1) {
			cakes = cakes/2+(cakes-cakes/2)-cakes/2;
			count++;
		}
		System.out.println(count);
		
	}

}
