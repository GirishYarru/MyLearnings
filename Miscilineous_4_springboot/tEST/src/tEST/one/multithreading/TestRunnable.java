package tEST.one.multithreading;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("**run** "+i);

		}
		
	}

}
