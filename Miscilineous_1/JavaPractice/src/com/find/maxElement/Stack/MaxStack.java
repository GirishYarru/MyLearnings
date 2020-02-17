package com.find.maxElement.Stack;

import java.util.Stack;

public class MaxStack {
	private static Stack<Integer> stack1 = new Stack<>();
	private static Stack<Integer> stack2 = new Stack<>();

	public static void pushElement(int element) {
		if (stack1.isEmpty())
			stack1.push(element);
		else {
			if (element > stack1.peek()) {
				stack1.pop();
				stack1.push(element);
			}
		}

		stack2.push(element);
	}

	public static int geMaxElement() {
		return stack1.peek();
	}

	public static void main(String[] args) {
		pushElement(7);
		pushElement(5);
		pushElement(1);
		pushElement(8);
		System.out.println(geMaxElement());

	}

}
