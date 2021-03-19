package javaEx;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료");
			System.out.print("선택>");

			int seletNum = scanner.nextInt();

			if (seletNum == 1) {
				System.out.print("예금액>");
				int deposit = scanner.nextInt();
				num += deposit;
			} else if (seletNum == 2) {
				System.out.print("출금액>");
				int withdraw = scanner.nextInt();
				num -= withdraw;
			} else if (seletNum == 3) {
				System.out.println("잔고>" + num);
			} else if (seletNum == 4) {
				System.out.print("종료합니다.");
				break;
			} else {
				System.out.println("다시입력하세요.");
			}

		}
		scanner.close();

	}
}
