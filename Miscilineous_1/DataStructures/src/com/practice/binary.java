package com.practice;

import java.util.Stack;

public class binary {
	private static Stack<Integer> stack = new Stack<>();

	public static void toBinary(int number) {
		if (number == 0 || number == 1) {
			stack.push(number);
			return;
		}
		stack.push(number % 2);
		toBinary(number / 2);
	}

	public static void toBinaryWithOutRec(int num) {
		int rem = 0;
		Stack st = new Stack();

		while (num > 0) {
			rem = num % 2;
			num = num / 2;
			st.push(rem);

		}

		while (!st.isEmpty())
			System.out.println(st.pop());
	}

	public static void main(String[] args) {

		// toBinary(8);
		toBinaryWithOutRec(8);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
