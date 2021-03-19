package exercise;

public class Day11 {

	public static void main(String[] args) {

		//if문 사용 예제
		int a = (int)(Math.random()*101); // 랜덤숫자뽑는법
		System.out.println("점수 : " + a);
		
		if(a>=80) {
			System.out.println("합격입니다.");
			System.out.println("축하드립니다.");
		}else {
			System.out.println("불합격입니다.");
			System.out.println("다시 도전하세요...");
		}
	}

}
