package tEST.one.even.odd;

public class Odd implements Runnable{
	private PrintEvenOdd poe;
	

	public Odd(PrintEvenOdd poe) {
		super();
		this.poe = poe;
	}


	@Override
	public void run() {
		
		poe.printOdd();
	}
	

}
