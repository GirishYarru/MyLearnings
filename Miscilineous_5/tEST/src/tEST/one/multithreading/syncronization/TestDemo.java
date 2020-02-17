package tEST.one.multithreading.syncronization;

public class TestDemo {

	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();

		Test t= new Test(d,"sandhya");
		t.start();
		
		Test t1= new Test(d1,"mindtre");
		t1.start();
		
		

	}

}
