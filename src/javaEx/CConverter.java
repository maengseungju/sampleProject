package javaEx;

public class CConverter {

	public static double rate;

	public static void setRate(double r) {
		CConverter.rate = r;

	}

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKRW(double dollar) {
		return dollar * rate;
	}

}