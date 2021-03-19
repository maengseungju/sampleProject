package javaEx;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String retry;
			int num = (int) (Math.random() * 100) + 1;
			int inputNum;

			System.out.println("========================");
			System.out.println("    [숫자맞추기게임 시작]");
			System.out.println("========================");
			while (true) {

				System.out.println("1과 100사이의 값을 입력하세요 : ");
				System.out.print(">>");
				inputNum = sc.nextInt();
				if (inputNum == num) {
					System.out.println("정답입니다.");
					break;
				} else if (inputNum > num) {
					System.out.println("더작게");
				} else if (inputNum < num) {
					System.out.println("더크게");
				}

				// 입력한 값 높은지 낮은지 맞추었는지 판단

			}
			sc.nextLine(); // 입력 버퍼 비우기

			System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			retry = sc.next();
			if ("y".equals(retry)) {
				break;// y일때 종료시키기
			} else if ("n".equals(retry)) {
				continue;// n 일때 게임 다시 시작
			} else {
				break;
			}
		}

		sc.close();

	}

}
