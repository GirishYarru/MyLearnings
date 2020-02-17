package com.concurrentModification;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("1");
		Iterator<String> itr = list.iterator();
		System.out.println(list);

		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp);
			list.add("2");
		}
		System.out.println(list);

	}

}
