package exercise;

import java.util.Arrays;

public class Day09 {

	public static void main(String[] args) {
		// 배열은 선언, 생성, 초기화 과정으로 이루어 진다.
		// 1. 배열의 선언
		int[] arr;
		
		// 2. 배열의 생성
		arr = new int[5];
		
		// 3. 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// 4. 배열의 사용
		System.out.println("배열의 두번째 : " + arr[1]);
		
		// 5. 배열의 생김새를 한눈에 문자열 형태로 보여주는 기능
		System.out.println(Arrays.toString(arr));
		
		// 6. 배열의 길이
		System.out.println("배열의 길이 : " + arr.length);
		
		// 7. 배열의 선언과 생성을 동시에 하는 법
		int[] arr2 = new int[6];
				
		// 8. 배열의 선언, 생성, 초기화를 동시에 하는 법
		int[] arr3 = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(arr3));
		
		// 9. 배열은 초기값을 지정하지 않으면 기본값으로 자동 초기화한다.
		System.out.println(Arrays.toString(arr2));
		
	}

}
