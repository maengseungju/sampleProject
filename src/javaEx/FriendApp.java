package javaEx;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Friend[] f = new Friend[3];

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < f.length; i++) {
			String a = sc.nextLine();
			String[] aa = a.split(" ");
			Friend f1 = new Friend(aa[0], aa[1], aa[2]);
			f[i] = f1;

		}

		// 친구정보 입력받기
		// 입력받은 친구정보를 공백으로 분리
		// Friend 객체 생성하여 데이터 넣기
		// 배열에 추가하기
		// 친구정보 출력

		for (int i = 0; i < f.length; i++) {

			f[i].show();
		}

		// 친구정보 출력 메소드 호출

		sc.close();
	}
}
