package javaEx;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요.");

		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.print("이름은 " + name + "입니다.");
		scanner.close();

	}

}
