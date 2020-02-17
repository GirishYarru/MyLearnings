package com.test.ds.mergesort;
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 

class GFG 
{ 
	// Prints numbers from 1 to n 
	static void printNos(int n) 
	{ 
		if(n > 0) 
		{ 
			printNos(n - 1); 
			System.out.print(n + " "); 
			System.out.println();
		}  
		//return; 
	} 
	
	static void testRecursion(int n) {
		if(n<1) {
			return;
		}
		System.out.println(" hello"+ n);
		testRecursion(n-1);
	}

	// Driver Code 
	public static void main(String[] args) 
	{ 
		//printNos(100); 
		testRecursion(10);
	} 
} 

// This code is contributed by Manish_100 
