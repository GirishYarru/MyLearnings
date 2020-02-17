package tEST.one.multithreading.syncronization;

public class Test extends Thread {
	Display display;
	String name;

	Test(Display display,String name) {
		this.display = display;
		this.name=name;
	}

	@Override
	public void run() {
		display.displayName2(name);
	}
}
