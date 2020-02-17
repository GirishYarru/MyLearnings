package tEST.one.multithreading;

public class Test extends Thread{
	//@Override
	public synchronized void run() {
		//System.out.println("in child "+Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
		for(int i =0;i<3;i++) {
			System.out.println("**"+ i +" priority ::"+Thread.currentThread().getPriority());
		}
	}
	
/*	@Override
	public void start() {
		run();
	}*/
	
}
