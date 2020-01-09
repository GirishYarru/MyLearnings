package com.find.maxElement.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxTenElements {
	private static Stack<Integer> stack1 = new Stack<>();
	private static Stack<Integer> stack2 = new Stack<>();
	private static Stack<Integer> stack3 = new Stack<>();
	private static Stack<Integer> stack4 = new Stack<>();
	private static Stack<Integer> stack5 = new Stack<>();
	private static Stack<Integer> temp = new Stack<>();

	private static List<Integer> list = new ArrayList<Integer>();

	public static void addElement(int element) {
		if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty() || stack4.isEmpty() || stack5.isEmpty()) {
			if (stack1.isEmpty()) {
				stack1.push(element);
				return;
			}
			if (stack2.isEmpty()) {
				stack2.push(element);
				return;
			}
			if (stack3.isEmpty()) {
				stack3.push(element);
				return;
			}
			if (stack4.isEmpty()) {
				stack4.push(element);
				return;
			}
			if (stack5.isEmpty()) {
				stack5.push(element);
				return;
			}
			list.add(element);
			return;
		}else {
			if(temp.isEmpty())
				temp.push(element);
			else {
				temp.pop();
				temp.push(element);
			}
		}
		if(element > stack1.peek()) {
			if(stack1.peek()>=stack2.peek()) {
				stack2.pop();
				stack2.push(stack1.peek());
				return;
			}
		}else if(element > stack2.peek()) {
			
		}
//		if (element > stack1.peek() && element < stack2.peek() && element < stack3.peek() && element < stack4.peek()
//				&& element < stack5.peek()) {
//			stack1.pop();
//			stack1.push(element);
//		} else if (element > stack2.peek() && element < stack1.peek() && element < stack3.peek()
//				&& element < stack4.peek() && element < stack5.peek()) {
//			stack2.pop();
//			stack2.push(element);
//		} else if (element > stack3.peek() && element < stack1.peek() && element < stack2.peek()
//				&& element < stack4.peek() && element < stack5.peek()) {
//			stack3.pop();
//			stack3.push(element);
//		} else if (element > stack4.peek() && element < stack1.peek() && element < stack3.peek()
//				&& element < stack2.peek() && element < stack5.peek()) {
//			stack4.pop();
//			stack4.push(element);
//		} else if (element > stack5.peek() && element < stack1.peek() && element < stack3.peek()
//				&& element < stack4.peek() && element < stack2.peek()) {
//			stack5.pop();
//			stack5.push(element);
//		}
		list.add(element);
	}

	public static List<Integer> getTopFiveMaxElements() {
		List<Integer> list = new ArrayList<>();
		list.add(stack1.peek());
		list.add(stack2.peek());
		list.add(stack3.peek());
		list.add(stack4.peek());
		list.add(stack5.peek());
		return list;
	}

	public static void main(String[] args) {
		addElement(10);
		addElement(4);
		addElement(2);
		addElement(8);
		addElement(14);
		addElement(12);
		addElement(16);
//16,12,14,10,8
		System.out.println(getTopFiveMaxElements());

	}

}
