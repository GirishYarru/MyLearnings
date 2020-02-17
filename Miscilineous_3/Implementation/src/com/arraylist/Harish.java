package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Harish {

	public static void printPages(int pages1) {
		
		Scanner s = new Scanner(System.in);
		int pages = s.nextInt();
		int test = 0;
		int sheetChange = 1;
		int sheetNum = 1;
		int num = 1;

		int tempSheetChange = 1;
		double sheets = Math.ceil(((double) pages) / 4);
		List<Object> pageNoList = new ArrayList<>();
		for (int i = 1; i <= sheets * 4; i++) {
			if (i > pages) {
				pageNoList.add("blank");
			} else {
				pageNoList.add(i);

			}

		}
		List<Object> sheetList = new ArrayList<>();
		for (int i = 0; i < sheets; i++) {
			sheetList.add("s" + sheetNum);
			sheetNum++;

		}

		List<Object> frontBackList = new ArrayList<>();
		frontBackList.add("front");
		frontBackList.add("back");

		for (int i = 0; i < pageNoList.size() / 2; i++) {
			
			if(i>=2 && i%2==0) {
				test++;
			}
			if (sheetChange > 2) {
				if (tempSheetChange >= 2) {
					System.out.println(sheetList.get(test) + "," + "back" + "," + pageNoList.get(i) + ","
							+ pageNoList.get(pageNoList.size() - num));
					tempSheetChange--;
				} else {
					System.out.println(sheetList.get(test) + "," + "front" + "," + pageNoList.get(pageNoList.size() - num) + ","
							+ pageNoList.get(i));
					tempSheetChange++;
				}
				sheetChange--;
			} else {
				if (tempSheetChange >= 2) {
					System.out.println(sheetList.get(test) + "," + "back" + "," + pageNoList.get(i) + ","
							+ pageNoList.get(pageNoList.size() - num));
					tempSheetChange--;
				} else {
					System.out.println(sheetList.get(test) + "," + "front" + "," + pageNoList.get(pageNoList.size() - num) + ","
							+ pageNoList.get(i));
					tempSheetChange++;
				}
				sheetChange++;
			}
			num++;

		}

	}
	
	public static void print() {
		Boolean flag;
		if(1==1)
		//	System.out.println(flag);

		System.out.println();
	}
	
	public static boolean testForLoop() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		//printPages(14);
	//	System.out.println(String.valueOf(null));
//	int i =10;
//	int b =20;
//		if(i==10) {
//			System.out.println("1");
//		}else if(b==20) {
//			System.out.println("2");
//		}else {
//			System.out.println("3");
//		}
		
		//System.out.println(testForLoop());
		String s1="harish";
		String s2="harish";
		System.out.println(s2.matches(s1));
		

	}

}
