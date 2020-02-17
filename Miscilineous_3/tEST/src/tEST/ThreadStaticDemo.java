package tEST;

public class ThreadStaticDemo {
	public static void main(String[] args) {
//		StaticMethodTest staticThread = new StaticMethodTest();
//		NonStaticMethodTest nonStaticThread = new NonStaticMethodTest();
//
//		staticThread.start();
//		nonStaticThread.start();
		 String s1 = "hello";
		String s2 = s1;
		System.out.println(s1==s2);
		System.out.println(s2);
	}

}
