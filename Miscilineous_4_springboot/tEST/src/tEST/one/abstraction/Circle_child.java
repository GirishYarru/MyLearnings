package tEST.one.abstraction;

public class Circle_child extends Shape_Abstract1 {

	public Circle_child(String name,int rollNo,int age) {
		super(name, rollNo,age);
		System.out.println("in circle const");
	}

	@Override
	void draw() {
		System.out.println("overridded circle child method");
	}

	@Override
	void draw1() {
		System.out.println(" name :"+this.getName()+"rollNo : "+getRollNo()+" age : "+age);
		
	}

}
