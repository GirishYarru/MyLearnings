package tEST.one.multipleinheritanc;

public class Child_Interface_Impl implements ParentInterface1,ParentInterface2{
	@Override
	public String message1() {
		System.out.println("hello");
	//	ParentInterface1.super.message1();
		return "in child";
	}
	


public static void main(String[] args) {
	Child_Interface_Impl child = new Child_Interface_Impl();
	child.message1();
	//child.message2();
	
	ParentInterface1 p = new Child_Interface_Impl();
	p.message1();
	
	
}		

}
