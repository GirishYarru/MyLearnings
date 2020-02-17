package tEST.one.even.odd;

public class Even implements Runnable{
	private PrintEvenOdd poe;
	
	

	public Even(PrintEvenOdd poe) {
		super();
		this.poe = poe;
	}



	@Override
	public void run() {
		poe.printEven();
		
	}

}
