package tEST.one.even.odd;

public class TestDemo {
	
public void m1() throws NullPointerException{
	m2();
}

public void m2() throws ArrayIndexOutOfBoundsException {
	throw new NumberFormatException();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo demo = new TestDemo();
		demo.m1();

	}

}
