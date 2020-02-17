package tEST;

public class DemoTest {
	public static int check() {
		try {
		
		throw new NullPointerException();

		}catch (Exception e) {
			System.out.println("in catch block");
			throw new NullPointerException();
		}finally {
			System.out.println("in finally block");

			return 2;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());

	}

}
