package tEST.one.test.inheritance;

public class B extends A{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
		System.out.println("hai");
	}
	
public static void main(String[] args) {
	B b = new B();
	b.m1();
}
}
