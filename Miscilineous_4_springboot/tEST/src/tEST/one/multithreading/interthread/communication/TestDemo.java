package tEST.one.multithreading.interthread.communication;

public class TestDemo {
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		try {
		//Thread.sleep(3000);

		synchronized (t) {
			
				t.wait();
				//Thread.sleep(2000);
				System.out.println("in main");

			
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
