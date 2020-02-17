package tEST.one.even.odd;

import java.util.ArrayList;

public class PrintEvenOdd {
	int start;
	int max;
	public PrintEvenOdd(int start, int max) {
		super();
		this.start = start;
		this.max = max;
	}
	
	
	public void printEven() {
		ArrayList<E>
		while(this.start<=max) {
			synchronized (this) {
				if(this.start%2==0) {
					System.out.println(Thread.currentThread().getName() );
					System.out.println(start);
					start++;
					this.notify();
				}else {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}

		}
		
	}
	
	
	
	public void printOdd() {
		while(this.start<=max) {
			synchronized (this) {
				if(this.start%2!=0) {
					System.out.println(Thread.currentThread().getName() );
					System.out.println(start);
					start++;
					this.notify();
				}else {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}

		}
		
	}

}
