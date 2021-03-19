package ThreadTest2;

public class Multithread2 {

	public static void main(String[] args) {

		Thread thread = new Thread(new DigitalRunnable());

		thread.start();

		for (int ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print((char)ch);

		}
	}

}
