package interfaceex;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">>");

			String a = sc.nextLine();
			String[] aa = a.split(" ");
			System.out.println("분리된 문자열 갯수는 : " + aa.length);

			if (aa.length == 3) {
				int n1 = Integer.parseInt(aa[0]);
				int n2 = Integer.parseInt(aa[2]);

				if ("+".equals(aa[1])) {
					Add add = new Add();
					add.setValue(n1, n2);
					System.out.println(">>" + add.calculate());

				} else if ("-".equals(aa[1])) {
					Sub sub = new Sub();
					sub.setValue(n1, n2);
					System.out.println(">>" + sub.calculate());

				} else if ("*".equals(aa[1])) {
					Mul mul = new Mul();
					mul.setValue(n1, n2);
					System.out.println(">>" + mul.calculate());

				} else if ("/".equals(aa[1])) {
					Div div = new Div();
					div.setValue(n1, n2);
					System.out.println(">>" + div.calculate());
				
				} else if ("/q".equals(aa[0])) {
					System.out.println("종료합니다.");

				} else {
					System.out.println("알 수 없는 연산입니다.");
				}

			} else {
				if (aa[0].equals("/q")) {
					System.out.println("종료합니다.");
					break;
				}

			}

		}

		sc.close();
	}
}
