package com.cognizant.practice;
// Java program to find number 
// of pairs with product less 
// than k in a sorted array 
class GFG 
{ 

// Function to count the pairs 
static int fun(int A[], 
			int n, int k) 
{ 
	// count to keep count of 
	// number of pairs with 
	// product less than k 
	int count = 0; 
	int i = 0; 
	int j = n - 1; 

	// Traverse the array 
	while (i < j) 
	{ 

		// If product is less than 
		// k then count that pair 
		// and increment 'i' 
		if (A[i] * A[j] < k) 
		{ 
			count += (j - i); 
			i++; 
		} 

		// Else decrement 'j' 
		else
		{ 
			j--; 
		} 
	} 

	// Return count of pairs 
	return count; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int A[] = {2, 3, 4,5, 6,7,8, 9}; 
	int n = A.length; 
	int k = 20; 
	
	System.out.println("Number of pairs with " + 
					"product less than 20 = " + 
								fun(A, n, k)); 
} 
} 

// This code is contributed 
// by Kirti_Mangal 
