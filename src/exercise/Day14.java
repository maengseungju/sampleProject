package exercise;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요>");
		int a = scanner.nextInt();

		// int a = (int)(Math.random()*101);

		// switch문의 소괄호 안에는 변수나, 변수에 연산이 들어갈 수 있다.
		
		switch (a / 10) {
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("과락입니다.");
		}
		scanner.close();
	}

}
