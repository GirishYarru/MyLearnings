package tEST.one.marker;

import tEST.one.multipleinheritanc.Parent1;

public class Stutent extends Parent1 implements Cloneable{

	private String name;
	private int rollNo;
	
	public Stutent(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Stutent st = (Stutent)obj;
		if(this.getRollNo()==st.getRollNo()) {
			return true;
		}else {
			return false;
		}
	}

}
