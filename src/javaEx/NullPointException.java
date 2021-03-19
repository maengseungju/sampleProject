package javaEx;

public class NullPointException {

	public static void main(String[] args) {

		String str = "hello";
		str = null;

		try {
			System.out.println(str.toString());

		} catch (Exception e) {
			System.out.println("예외발생");
		}

		System.out.println("프로그램 정상 종료");

	}
}
