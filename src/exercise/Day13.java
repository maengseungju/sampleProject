package exercise;

import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("점수입력> ");

		int a = scanner.nextInt();
		if (a >= 90) {
			System.out.println("축하드립니다.");
			if (a >= 95) {
				System.out.println("A+학점입니다.");
			} else {
				System.out.println("A학점입니다.");
			}
		} else if (a >= 80) {
			System.out.println("B학점입니다.");
		} else if (a >= 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("과락입니다.");
		}
		scanner.close();
	}

}
