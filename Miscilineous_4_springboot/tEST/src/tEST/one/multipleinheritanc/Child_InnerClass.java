package tEST.one.multipleinheritanc;

public class Child_InnerClass extends Parent1{
	@Override
	public void message1() {
		System.out.println("In overrided child");
	}
	
	public class Innerchild extends Parent2{
		@Override
		public void message2() {
			System.out.println("In overrided Child-2 : message-2");
		}
	}
	

}
