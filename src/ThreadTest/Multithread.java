package ThreadTest;

public class Multithread {

	public static void main(String[] args) {

		Thread thread = new DigitThread();
		Thread thread1 = new DigitThread();
		Thread thread2 = new AlphabetThread();

		thread.start();
		thread1.start();
		thread2.start();
		
		for (int c = 0; c < 10; c++) {
			System.out.print(c);

		}
	}

}
