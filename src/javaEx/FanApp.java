package javaEx;

public class FanApp {

	public static void main(String[] args) {

		Fan f = new Fan(false, 0, false);
		f.status();

		f.power();
		f.status();

		f.fanSpeed(1);
		f.tilt(true);
		f.status();

		f.fanSpeed(true);
		f.fanSpeed(false);
		f.fanSpeed(false);
		f.status();
		
		f.fanSpeed(true);
		f.status();
		
		f.power();
		f.status();
	}

}
