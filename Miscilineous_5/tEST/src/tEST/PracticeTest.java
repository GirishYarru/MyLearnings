package tEST;

import java.util.Arrays;

public class PracticeTest {
	// 1)*************************fibonacci Series****************
	public static int fibanocciTest(int n) {
		if (n <= 1)
			return n;
		return fibanocciTest(n - 1) + fibanocciTest(n - 2);

	}
	// 2)*************************Transpose and its multipliction ****************

	public static void transposeOfMatrix(int rows, int columns) {
		Integer[][] a = new Integer[rows][columns];
		Integer[][] b = new Integer[columns][rows];
		Integer[][] c = new Integer[rows][rows];

		int temp = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				a[i][j] = temp;
				temp++;
				System.out.println(a[i][j]);
			}
			System.out.println("--");

		}
		System.out.println("---------------");
		// transpose of matrix
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				b[i][j] = a[j][i];
				// temp++;
				System.out.println(b[i][j]);
			}
			System.out.println("--");

		}

		// multiply a*aT of matrix --> m,q(c[i][j]=0;n(c[i][j]+a[i][k]*b[k][j]
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				c[i][j] = 0;
				for (int k = 0; k < columns; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}

			}
		}

		System.out.println("*********Multiplication********");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.println(c[i][j]);
			}

			System.out.println("-------------");

		}

	}

	// 3)***********************Remove duplicates from array ***************
	public static void removeDuplicates(int[] array) {
		if (array.length > 0) {
			Arrays.sort(array);
			int[] temp = new int[array.length];
			int j = 0;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] != array[i + 1]) {
					temp[j++] = array[i];

				}

			}
			temp[j++] = array[array.length - 1];
			for (int i = 0; i < j; i++) {
				array[i] = temp[i];
				System.out.print(array[i]);
			}
		}

	}

	// 4)*****************Remove duplicates from string **********
	public static void removeDuplicatesFromString(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (!output.contains(String.valueOf(str.charAt(i)))) {
				output = output + str.charAt(i);
			}
		}
		System.out.println();
		System.out.println(output);
	}

	// 5)**************find sub string and replace ***********
	public static void findSubStringAndReplace(String str, String subStr, String newSubStr) {
		if (str.contains(subStr)) {
			str = str.replace(subStr, newSubStr);
		}

		System.out.println(str);

	}

	// 6)************print frequency of sub string
	public static void printSubStringFrequency(String str, String sub) {
		int index = str.indexOf(sub);
		int count = 0;
		while (index >= 0) {
			index = str.indexOf(sub, index + 1);
			count++;
		}

		System.out.println(count);
	}

	// 7) print distinct elements
	public static void printDistinctElements(int array1[], int array2[]) {
		for (int i = 0; i < array1.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				System.out.println(array1[i]);
			}
		}

		for (int i = 0; i < array2.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
					isFound = true;
				}
			}
			if (!isFound) {
				System.out.println(array2[i]);
			}
		}

	}

	// 8) Remove vowels from String
	public static void removeVowelsFromString(String str) {
		str = str.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(str);
	}

	// 9) count vowels,consonants,digits and spaces
	public static void countVowelsConsonantsDigitsSpaces(String str) {
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else if (ch == ' ') {
				spaces++;
			}
		}

		System.out
				.println("Vowels " + vowels + " consonantes " + consonants + " digits " + digits + " spaces " + spaces);

	}

	// 10 print all prime numbers
	public static void printAllPrimeNumbers(int n) {
		for (int num = 2; num <= n; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true)
				System.out.println(num);
		}

	}

	// 11) print gcd of two numbers
	public static int gcdOfTwoNumbers(int a, int b) {
		int i = 0;
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		i = a % b;
		if (i == 0) {
			return b;

		}
		a = b;
		b = i;
		return gcdOfTwoNumbers(a, b);
	}
	
		

	public static void main(String[] args) {
		System.out.println("**********fibonacci*******");
		// fibonacci
		int result = fibanocciTest(5);
		System.out.println("fibonacci " + result);
		System.out.println("**********transpose*******");
		// transpose
		transposeOfMatrix(3, 2);
		System.out.println("**********remove duplicates from array*******");
		// 3)remove duplicates
		int[] array = { 5, 5, 6, 4, 4, 3, 2, 1, 1 };
		removeDuplicates(array);
		System.out.println("**********remove duplicates from String*******");
		// 4)Remove dupliates from string
		removeDuplicatesFromString("girish");
		System.out.println("**********find sub strng and replace*******");
		// 5)find substring and replace
		findSubStringAndReplace("baba baba black sheep", "baba", "hello");
		System.out.println("**********find frequency of string*******");
		// 6)print frequency of substring
		printSubStringFrequency("hello hai madam how are you hai madam hai hai", "hai");
		System.out.println("*********print distinct elements from 2 arrays *********");
		// 7 print distinct elements from string
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3 };
		printDistinctElements(array1, array2);
		System.out.println("Remove vowels from String");
		// 8 remove vowels from string
		removeVowelsFromString("HELLO");
		// 9 count vowels consonants, digits and spaces
		System.out.println("******count vowels , consonants,digits,spaces***");
		countVowelsConsonantsDigitsSpaces("hello");
		System.out.println("*********print prime numbers****");
		// 10 print all prime numbers
		printAllPrimeNumbers(10);
		System.out.println("*********gcd of two numbers******");
		//11 gcdOf two numbers
		int gcd = gcdOfTwoNumbers(5,10);
		System.out.println(gcd);
		//12 gcd of n numbers
	}

}
