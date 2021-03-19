package javaEx;

import java.util.Scanner;

public class if_elseEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수 입니다");
			} else {
				System.out.println("홀수 입니다");
			}
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수 입니다");
		}
		scanner.close();
	}

}
