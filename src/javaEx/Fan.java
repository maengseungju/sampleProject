package javaEx;

public class Fan {

	private boolean power;
	private int fanSpeed;
	private boolean tilt;

	public boolean isPower() {
		return power;
	}

	public int getFanSpeed() {
		return fanSpeed;
	}

	public boolean isTilt() {
		return tilt;
	}

	public Fan(boolean power, int fanSpeed, boolean tilt) {
		super();
		this.power = power;
		this.fanSpeed = fanSpeed;
		this.tilt = tilt;
	}

	public void status() {
		System.out.println("===  선풍기정보  ===");
		System.out.println("전원 : " + this.isPower());
		System.out.println("바람세기 : " + this.getFanSpeed());
		System.out.println("회전 : " + this.isTilt());
		System.out.println("===  E  N  D  ===");
		System.out.println("");
	}

//	public void power(boolean b) {
//		this.power = b;
//	}
//
	public void tilt(boolean b) {
		this.tilt = b;
	}

	public void fanSpeed(int i) {
		if (i > 3) {
			this.fanSpeed = 3;
		} else if (i < 1) {
			this.fanSpeed = 1;
		} else {
			this.fanSpeed = i;
		}
	}

	public void fanSpeed(boolean b) {
		if (b) {
			if (this.fanSpeed < 3) {
				this.fanSpeed++;
			}
		} else {
			if (this.fanSpeed > 1) {
				this.fanSpeed--;

			}
		}

	}

	public void power() {
		if (this.power) {
			this.fanSpeed = 0;
			this.tilt = false;
			this.power = false;
		} else {
			this.fanSpeed = 1;
			this.tilt = false;
			this.power = true;
		}

	}
}
