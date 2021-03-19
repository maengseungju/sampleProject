package exercise;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		
		// 반복문 연습이 필요하다.
		// 뭔말인지 잘 모르겠네
		// 모르는건 연습좀 해야되는데...
		
		
		// 정수를 입력받아 소수인지 판별
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scanner.nextInt();
		
		int a = 2; // 소수판별을 위해 나누어줄 제어변수
		while(num % a != 0) {

			a++;
		}
		
		if(num == a) {
			System.out.println(num + " 소수입니다.");
		}else {
			System.out.println(num + " 소수가 아닙니다.");
		}
		scanner.close();
	}
}
