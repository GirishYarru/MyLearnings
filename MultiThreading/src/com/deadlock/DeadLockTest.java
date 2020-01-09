package com.deadlock;

/*Detecting ThreadLocks:
	1)Through Code:- Analyze nested synchronize blocks
    2)Through tools like jconsole/VisualVm
    3)in linux "kill -3" print status all threads in applications log file

Avoiding DeadLock:
	1)It is not due to multiple threads but due to the way they are requesting lock
    2)Avoid circular waiting*/
public class DeadLockTest {
	public static void main(String[] args) {
		String obj1 = "Object1";
		String obj2 = "Object2";
		Runnable r1 = () -> {
			synchronized (obj1) {
				System.out.println("Locked object1 and about to lock object2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

				synchronized (obj2) {
					System.out.println("Locked object 2");
				}
			}
		};

		Runnable r2 = () -> {
			synchronized (obj2) {
				System.out.println("Locked object2 and about to lock object 1");
				synchronized (obj1) {
					System.out.println("Locked object 1");

				}

			}

		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
