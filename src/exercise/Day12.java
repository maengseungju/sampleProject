package exercise;

import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {

		// if else-if문 사용 예제
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수입력> ");

		int a = scanner.nextInt();

		if (a >= 90) {
			System.out.println("A학점입니다.");
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
