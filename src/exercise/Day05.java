package exercise;

public class Day05 {

	public static void main(String[] args) {
		/*
		 * 변수는 중괄호 안에서 선언되고
		 * 중괄호 안에서만 유효하다.
		 */
		
//		int num1 = 10;  이렇게 작성할수 있고
//		int num2 = 20;  아래와 같이 붙여서 작성할수 있음
		int num1 = 10, num2 = 20, num3 = 30;
		int num6 = 1;
		
		if(num1 > 5) {
			int num4 = 1;
			int num5 = num1 + num2 + num3;
			num6 = 100;
		}
		
//		System.out.println(num4); 이렇게 중괄호 밖에서 사용은 안된다.
//		System.out.println(num5); 중괄호 밖에서 사용하고 싶으면
//		아래와 같은 num6을 보고 사용하면 된다.
//		
		System.out.println(num6);
		
		
	}

}
