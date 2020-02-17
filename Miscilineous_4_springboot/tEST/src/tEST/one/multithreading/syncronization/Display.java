package tEST.one.multithreading.syncronization;

public class Display {
	public static synchronized void displayName(String name) {
		for (int i = 0; i < 8; i++) {
			System.out.println("name is " + name);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void displayName1(String name) {
		for (int i = 0; i < 8; i++) {
			synchronized (this) {
				System.out.println(this.getClass().getSimpleName());
				System.out.println("name is " + name);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public void displayName2(String name) {
		synchronized (Display.class) {
			for (int i = 0; i < 8; i++) {

				System.out.println("name is " + name);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
