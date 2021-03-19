package exercise;

public class Day07 {

	public static void main(String[] args) {

		// 부호 연산자 +, - (양수와 음수를 나타내는거임)
		
		// 증감연산자 ++, -- 
		int a = 1;
		int b = a++; // 후위연산자 : 오른쪽의 값을 왼쪽에 대입 후
					 //          왼쪽에 있는 값을 +1 증가시킨다.
		
		System.out.println("a의 값 : "+ a);
		System.out.println("b의 값 : "+ b);
		
		int c = 1;
		int d = ++c; // 전위 연산자 : 오른쪽에 있는 값을 증가시킨 후
		             //            왼쪽으로 대입한다.
		System.out.println("c의 값 : "+ c);
		System.out.println("d의 값 : "+ d);
		
		int e = 1;
		e++;; // 기본적인 형태의 연산
		++e;; //
		e--;; //
		--e;; //
		System.out.println(e);
		
		// 비트반전 연산자 ~
		// 정수값을 2진수로 표현해서 각 자리 수를 반전시킨다.
		
		// 논리 반전 연산자! 
		// true 를 false로, false를 true로 반전시킨다.
		
	}

}
