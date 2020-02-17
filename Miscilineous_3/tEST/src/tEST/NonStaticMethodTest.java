package tEST;

public class NonStaticMethodTest extends Thread{
	
	public void nonStaticTest() {
		System.out.println("hai");
	}
	
	@Override
	public void run() {
		nonStaticTest();
	}

}
