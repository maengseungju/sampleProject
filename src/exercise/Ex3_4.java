package exercise;

public class Ex3_4 {

	public static void main(String[] args) {

		// 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 
		// 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		// 13개의 바구니 가 필요할 것이다. (1)에 알맞은 코드를 넣으시오
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		
		int numOfBucket =                    // 아래 괄호안에 있는 문장이 알맞은 코드이다.
				numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("필요한 바구니 수 : " + numOfBucket);
		
		
	}

}
