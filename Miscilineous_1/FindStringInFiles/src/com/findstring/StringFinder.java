package com.findstring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringFinder {
	private static final String FILE_NAME = "File name ::";
	private static final String SEPERATOR = " >>>>>>>>> ";
	private static final String LINE_NUMBER = "Line number ::";
	private static String DIRECTORY = "C:\\M1014166\\logs";

	private StringFinder() {

	}

	private static boolean checkIfLineContains(String[] arr, String inputStr) {
		return Arrays.stream(arr).parallel().allMatch(inputStr::contains);
	}

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Default directory is C:\\M1014166\\logs");
		System.out.println("Do you want to change it ?(y/n)");
		String changeDirectory = scanner.next();
		if ("y".equalsIgnoreCase(changeDirectory)) {
			System.out.println("Enter the directory path : ");
			DIRECTORY = scanner.next();
		}
		System.out.println("---------------Directory " + DIRECTORY);
		int numOfStrings = 0;
		try {
			System.out.println("Enter the no.of strings you want to search : ");
			numOfStrings = scanner.nextInt();
		} catch (Exception e) {
			throw new IllegalArgumentException("***************In Valid Input***************");
		}
		String[] strlist = new String[numOfStrings];
		for (int i = 0; i < strlist.length; i++) {
			System.out.println("Enter the string to find: ");
			strlist[i] = scanner.next();
		}
		File dir = new File(DIRECTORY);
		File[] directoryListing = dir.listFiles();
		Runnable task = () -> {
			if (directoryListing != null) {
				boolean flag = false;
				for (File child : directoryListing) {
					try (FileReader reader = new FileReader(child); BufferedReader br = new BufferedReader(reader)) {
						long count = 1;
						String st;
						while ((st = br.readLine()) != null) {
							if (checkIfLineContains(strlist, st)) {
								System.out.println(FILE_NAME + child.getName() + SEPERATOR + LINE_NUMBER + count);
								flag = true;
							}
							count++;
						}
						count = 0;
					} catch (IOException e) {
						throw new IllegalArgumentException(e);
					}
				}
				if (!flag)
					System.out.println("Given strings are not found ");
			} else {
				throw new IllegalArgumentException("No files found in given directory");
			}
		};
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		service.submit(task);
		service.shutdown();

	}

}
