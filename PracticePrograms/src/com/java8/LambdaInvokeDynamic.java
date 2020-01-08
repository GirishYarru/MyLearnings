package com.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaInvokeDynamic {
  boolean run = true;

	public void localVariableMultithreading() throws InterruptedException {
	    ExecutorService service = Executors.newFixedThreadPool(2);
	    service.execute(() -> {
	        while (run) {
	        	System.out.println("helloooo");
	            // do operation
	        }
	    });
	    System.out.println("***");
		   Thread.sleep(100);

	   run = false;
	}
	public static void main(String[] args) throws InterruptedException {
//		Lambda l = new Lambda() {
//
//			@Override
//			public void test() {
//				System.out.println("hello");
//			}
//		};
//		
		
		int i = 0;
		int a = 10;
		Lambda l = ()->{
			
			System.out.println("hello"+ i);};
			a++;
		l.test();
		
		LambdaInvokeDynamic dynamic = new LambdaInvokeDynamic();
		dynamic.localVariableMultithreading();
		
		
	}

}
