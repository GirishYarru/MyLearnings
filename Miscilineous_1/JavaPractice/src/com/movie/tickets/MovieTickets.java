package com.movie.tickets;

import java.util.LinkedList;
import java.util.Queue;

public class MovieTickets {
	public static int purchaseTickets(int[] arr, int position) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
		}
		int time = 1;
		int tempPosition = 1;
		while (true) {
			if (tempPosition == position) {
				if (queue.peek() - 1 == 0) {
					queue.poll();
					return time;
				} else {
					queue.add(queue.poll() - 1);
					tempPosition = 1;
					position = queue.size();
				}

			} else {
				if (queue.peek() - 1 == 0) {
					queue.poll();
				} else {
					queue.add(queue.poll() - 1);

				}
				tempPosition++;
			}
			time++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		int time = purchaseTickets(arr, 2);
		System.out.println(time);
	}

}
