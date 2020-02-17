package tEST.one.multipleinheritanc;

public interface ParentInterface1 {
	default String message1() {
		System.out.println("ParentInterface-1 : message-1");
		return "interface";
		
	}

}
