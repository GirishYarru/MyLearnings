package tEST.one.sandhya.test;

public class Child extends Parent{
	
	public static void main(String[] args) {
		Child c = new Child();
		try {
			c.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


