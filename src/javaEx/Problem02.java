package javaEx;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

//		for(int i=1; i<=num; i++){  //세로로 1부터 입력한 값까지 반복
//			for( ;  ; j++){  //가로로 현재 세로숫자 부터 세로숫자 까지 반복
//				System.out.print();
//			}
//			System.out.println("");
//		}
		for (int i = 1; i <= num; i++) { // 세로로 1부터 입력한 값까지 반복
			for (int j = 1; j <= i; j++)
				System.out.print(i);

			System.out.println();

		}

		sc.close();
	}

}
