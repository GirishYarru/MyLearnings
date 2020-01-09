package com.test;

public class Distances {

	public static int calculateDistance(String str) {
		char[] ch = str.toCharArray();
		int actualCount = 0;
		int tempCount = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i; j < ch.length - 1; j++) {
				String temp = "" + ch[j] + ch[j + 1];
				for (int k = j + 1; k <=ch.length - 2; k++) {
					if (temp.equals("" + ch[k] + ch[k + 1])) {
						tempCount = k - j;
						if (tempCount > actualCount)
							actualCount = tempCount;

					}
				}

			}

		}
		return actualCount==0?-1:actualCount;

	}

	public static void main(String[] args) {

		System.out.println(calculateDistance("codiiiility"));

	}

}
