package tEST;

public class StaticMethodTest extends Thread{
	
	public static void testStatic() {
		System.out.println("hello");
	}
	

	
	@Override
	public void run() {
		StaticMethodTest.testStatic();
	}

}
