package exercise;

public class Ex2_8 {

	public static void main(String[] args) {

		/*
		 * x,y,z 변수를 서로 바꾸는 연습문제이다. 
		 * x=2, y=3, z=1 이 되도록 바꾸어보아라.
		 */

		int x = 1;
		int y = 2;
		int z = 3;

		// 아래 처럼 작성하면 된다.
		int temp = x; // 새로운 변수를 만들고
		x = y;        // 바꾸어서 넣으면 된다.
		y = z;
		z = temp;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
