package exercise;

public class Ex3_3 {

	public static void main(String[] args) {

		
		// num값 중 100의자리 밑으로는 버리는 코드를 만들어봐라.
		int num = 456;
		
		// 나눗셈 연자는 반올림을 하지 않고 버림을 한다.
		System.out.println(num/100*100); 
		// 어떤숫자를 100으로 나누면
		// 십의자리 일의 자리는 버리고 백의 자리 숫자만 나눈다.
        // 그래서 456을 100으로 나누면 4가 되고 4를 다시 100으로 곱하면
		// 400이 된다.
		// 
		// 456 / 100 -> 4
        // 4 * 100 -> 400
	}

}
