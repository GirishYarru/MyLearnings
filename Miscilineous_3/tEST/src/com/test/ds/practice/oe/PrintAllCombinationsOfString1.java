package com.test.ds.practice.oe;

public class PrintAllCombinationsOfString1 {
	public void permutate(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str,l,i);
				permutate(str,l+1,r);
				swap(str,l,i);

			}
		}

	}

	public String swap(String str, int l, int r) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[l];
		charArray[l] = charArray[r];
		charArray[r] = temp;
		return String.valueOf(charArray);

	}

	public static void main(String[] args) {
		PrintAllCombinationsOfString1 s1 = new PrintAllCombinationsOfString1();
		s1.permutate("ABC", 0, 2);

	}

}
