package com.movie.tickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchString {
	public static List<String> searchString(List<String> list, String keyWord) {
		List<String> resultList = new ArrayList<>();
		for (String str : list) {
			if (str.contains(keyWord)) {
				resultList.add(str);
			}
		}
		Collections.sort(resultList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1.indexOf(keyWord) == 0 && o2.indexOf(keyWord) == 0) {
					return 0;
				} else if (o1.indexOf(keyWord) == 0 && o2.indexOf(keyWord) != 0) {
					return -1;
				} else if (o2.indexOf(keyWord) == 0 && o1.indexOf(keyWord) != 0) {
					return 1;

				} else if (o1.lastIndexOf(keyWord) == o1.length() - keyWord.length()
						&& o2.lastIndexOf(keyWord) == o2.length() - keyWord.length()) {
					return 0;
				} else if (o1.lastIndexOf(keyWord) == o1.length() - keyWord.length()
						&& o2.lastIndexOf(keyWord) != o2.length() - keyWord.length()) {
					return -1;
				} else if (o2.lastIndexOf(keyWord) == o2.length() - keyWord.length()
						&& o1.lastIndexOf(keyWord) != o1.length() - keyWord.length()) {
					return 1;
				}

				return 0;
			}
		});
		return resultList;
	}

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("test");
		strList.add("123testabc");
		strList.add("123test");

		strList.add("testing");
		strList.add("qwewqtestzxcs");
		strList.add("qwtestsadfef");
		strList.add("test123");
		strList.add("asdftest");

		List<String> result = searchString(strList, "test");
		System.out.println(result);
	}

}
