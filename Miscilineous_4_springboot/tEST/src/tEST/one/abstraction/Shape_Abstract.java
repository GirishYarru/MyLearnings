package tEST.one.abstraction;

public abstract class Shape_Abstract {
	private int rollNo;
	private String name;
	public Shape_Abstract() {
		System.out.println("in shape const");
	}
	Shape_Abstract(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
		
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract void draw();

}
