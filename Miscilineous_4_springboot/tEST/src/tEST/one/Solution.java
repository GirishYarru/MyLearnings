package tEST.one;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int noOfElements = sc.nextInt();
		int n = sc.nextInt();
		Integer[] arr = new Integer[noOfElements];
		for (int i = 0; i < noOfElements; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int j, last;
			// Stores the last element of array
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				// Shift element of array by one
				arr[j] = arr[j - 1];
			}
			// Last element of array will be added to the start of array.
			arr[0] = last;
		}
		for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        } 
		
	}
}
