package tEST.one.abstraction;

public class Demo {
	public static void main(String[] args) {
		Shape_Abstract shape = new Circle_child("girish",0,25);
		shape.draw();
		
		Circle_child shape1 = new Circle_child("girish",0,25);
		shape1.draw1();
	}

}
