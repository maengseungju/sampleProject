package ThreadTest2;

public class DigitalRunnable implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}

}
