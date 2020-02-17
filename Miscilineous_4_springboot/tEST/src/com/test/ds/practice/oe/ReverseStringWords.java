package com.test.ds.practice.oe;

import java.util.Stack;

public class ReverseStringWords {
	public void reverseStringWords(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				st.push(ch);

			} else {
				while(st.empty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}

		}
		while(st.empty() == false) {
			System.out.print(st.pop());
		}

	}

	public static void main(String[] args) {
		ReverseStringWords rev = new ReverseStringWords();
		rev.reverseStringWords("geek for girish");

	}

}
