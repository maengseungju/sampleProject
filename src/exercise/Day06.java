package exercise;

public class Day06 {

	public static void main(String[] args) {

		byte b = 10;
		int i = b; // byte -> int형으로 자동 형변환
		// 작은 타입에서 큰 타입으로 자동으로 형변환 가능
		
		
		int a = 10; // int -> byte형으로 자동 형변환 불가
		byte e = (byte)i;
		// 이런 식으로 강제 형변환해서 사용 가능
		
		/*
		 * 강제입변환을 사용할 때 주의할 점은
		 * 해당 데이타 타입을 받아들일 수 없는 범위의 값이 들어오면
		 * 임의의 값을 저장합니다.
		 */
		
	}

}
