package com.volatileatomic;

public class VolatileAndAtomicDemo extends Thread{
	//volatile
   boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated." + count);
    }

    public static void main(String[] args) throws InterruptedException {
    	VolatileAndAtomicDemo t = new VolatileAndAtomicDemo();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
       // t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }}
