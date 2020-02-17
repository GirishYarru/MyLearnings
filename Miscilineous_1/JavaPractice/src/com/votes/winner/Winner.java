package com.votes.winner;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Winner {
	public static String printWinner(String[] arr) {

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null)
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				if (e1.getValue() == e2.getValue()) {
					if (e1.getKey().length() == e2.getKey().length())
						return e1.getKey().compareTo(e2.getKey());
					return e1.getKey().length() - e2.getKey().length();

				}
				return e2.getValue() - e1.getValue();
			}

		});
		
		return list.get(0).getKey();

	}

	public static void main(String[] args) {
		String[] arr = { "John", "John", "John", "Jexica", "Jexica", "Jexica", "Sam" };
		String winner = printWinner(arr);
		System.out.println("Winner:: " + winner);
	}

}
