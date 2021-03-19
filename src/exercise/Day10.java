package exercise;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {

		// 1. 스캐너 기능 생성
		Scanner scanner = new Scanner(System.in);

		// 2. 스캐너가 가지고 있는 기능을 통해서 데이터를 입력 받음.
		System.out.print("입력해주세요>");
		String intro = scanner.nextLine(); // 공백을 포함하는 문자열 받음.

		System.out.print("이름>");
		String intro1 = scanner.next(); // 공백을 포함하지 않는 문자열 받음.

		System.out.print("나이>");
		int intro2 = scanner.nextInt(); // 정수를 받을땐 이렇게 씀.

		System.out.println("자기소개 : " + intro);
		System.out.println("이름 : " + intro1);
		System.out.println("나이 : " + intro2);

		// 3. 스캐너 기능 종료
		scanner.close();

	}

}
