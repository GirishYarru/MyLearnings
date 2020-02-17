package tEST.one.multipleinheritanc;

public class Child_Aggregation {
	//multiple inheritance using child
	private Parent1 parent1 = new Parent1();
	private Parent2 parent2 =  new Parent2();
	public Parent1 getParent1() {
		return parent1;
	}
	public void setParent1(Parent1 parent1) {
		this.parent1 = parent1;
	}
	public Parent2 getParent2() {
		return parent2;
	}
	public void setParent2(Parent2 parent2) {
		this.parent2 = parent2;
	}
	
	public static void main(String[] args) {
		Child_Aggregation child = new Child_Aggregation();
		child.getParent1().message1();
		child.getParent2().message2();

	}
	

}

