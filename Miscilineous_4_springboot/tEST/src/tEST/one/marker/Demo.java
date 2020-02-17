package tEST.one.marker;

public class Demo implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Stutent st = new Stutent("marker", 1);
		System.out.println(st.getName());
		Stutent st1 = new Stutent("marker", 2);

		Stutent newSt = (Stutent) st.clone();
		//newSt.setName("doll");
		System.out.println(newSt.getName());
		
		System.out.println(st.equals(newSt));;
		
		
		

		
		

	}

}
