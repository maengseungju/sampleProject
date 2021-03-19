package javaEx;

public class Problem05 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++){ //가로축 반복조건
			for(int j=i; j<=9+i; j++) {
				System.out.print(j+"\t");
			}
				
		    //세로축 반복조건
			System.out.println();
		}
		System.out.println();
	}

}
