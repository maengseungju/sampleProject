package exercise;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String medal = "";
		System.out.print("등수를 입력하세요 : ");
		medal = sc.nextLine();
		
		switch(medal) {
		case "1":
			System.out.println("금메달");
			break;
		case "2":
			System.out.println("은메달");
			break;
		case "3":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		sc.close();
	}

}
