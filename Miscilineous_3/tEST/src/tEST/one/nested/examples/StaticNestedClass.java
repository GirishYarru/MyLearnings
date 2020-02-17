package tEST.one.nested.examples;

public class StaticNestedClass {
	private static int y =20;
	
	public static class InnerClass{
		private void printMessage() {
			System.out.println(y);
		}
		
		
	}

}
