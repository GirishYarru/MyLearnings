package tEST.one.even.odd;

public class EvenOddDriver {
	public static void main(String[] args) {
		PrintEvenOdd poe = new PrintEvenOdd(1, 20);
		Thread even = new Thread(new Even(poe));
		even.setName("even thread");
		even.start();
		
		Thread odd = new Thread(new Odd(poe));
		odd.setName("odd thread");
		odd.start();
		
	}

}
