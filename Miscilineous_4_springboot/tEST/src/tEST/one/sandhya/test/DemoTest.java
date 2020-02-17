package tEST.one.sandhya.test;

public class DemoTest {
public static void main(String[] args) throws CloneNotSupportedException {
	A a=new A();
	a.i=2;
	a.j=4;
	


	A b=(A) a.clone();
	b.i=3;
	System.out.println("value i "+a.i+" value j "+a.j);
	System.out.println("value i "+b.i+" value j "+b.j);

}
}
