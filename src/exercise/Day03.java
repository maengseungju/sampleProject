package exercise;

public class Day03 {

	public static void main(String[] args) {

		// 클래스 이름 규칙
		// 클래스의 첫글자는 대문자로 표기
		// 연결된 단어의 첫글자도 대문자로 표기

		// 식별자는 대소문을 구별한다.
		int age = 10; // 여기서 =는 같다는게 아니라 10을 age에 대입하다는 뜻임
		int Age = 20;
		int aGe = 30;

		System.out.println(age);
		System.out.println(Age);
		System.out.println(aGe);
		
		// 변수의 이름은 소문자로 시작하고 연결되는 단어는 대문자로 표기
		// 식별자 이름은 숫자로 시작할 수 없음, 공백도 사용할 수 없음
		
//		int 4num = 10; 앞에 숫자안됨
		int num4 = 10;
		
//		int phone number = 10; 중간에 공백안됨 
		int phoneNumber = 10;
		
		// 식별이름으로 자바의 키워드를 사용할 수 없음
		// 키워드는 자주색으로 표시된게 키워드라고함
		
		System.out.println(num4);
		System.out.println(phoneNumber);
		
	}

}
