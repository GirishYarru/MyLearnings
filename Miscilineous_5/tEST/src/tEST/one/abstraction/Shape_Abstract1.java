package tEST.one.abstraction;

public abstract class Shape_Abstract1 extends Shape_Abstract{
	protected int age;
//	@Override
//	public void draw() {
//		System.out.println("in final method");
//		
//	}
	public Shape_Abstract1() {
	}
	Shape_Abstract1(String name,int rollNo,int age){
		super(name, rollNo);
		this.age=age;
	}
	abstract void draw1();


}
