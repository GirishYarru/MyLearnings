package com.prgm.test;

// Java program to count number of 
// possible ways to a given score 
// can be reached in a game where 
// a move can earn 3 or 5 or 10 
import java.util.Arrays;

class GFG1 {
	// Returns number of ways to reach score n
	static int count(int n) {

		int table[] = new int[n + 1], i;

		Arrays.fill(table, 0);

		table[0] = 1;

		for (i = 2; i <= n; i++)
			table[i] += table[i - 2];
		for (i = 4; i <= n; i++)
			table[i] += table[i - 4];
		for (i = 6; i <= n; i++)
			table[i] += table[i - 6];

		return table[n];

	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println("Count for " + n + " is " + count(n));

		n = 13;
		System.out.println("Count for " + n + " is " + count(n));
	}
}

// This code is contributed by Anant Agarwal. 
