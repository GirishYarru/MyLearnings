package com.lucky.copoun;

public class LuckyCopoun {
	public static int luckyWinners(int n) {
		int[] arr = new int[n];// initialize array of size n
		int temp;// temporary Variable
		for (int i = 1; i <= n; i++) {
			temp = i;
			while (temp > 9) {
				temp = temp % 10;
				temp = temp + i / 10;

			}
			arr[i - 1] = temp;

		}
		int count = 0;
		int maxCount = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}

			}
			if (count > maxCount)
				maxCount = count;
			count = 0;

		}
		return maxCount;

	}

	public static void main(String[] args) {
		int result = luckyWinners(22);
		System.out.println(result);
	}

}
