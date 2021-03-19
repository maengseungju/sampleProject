package javaEx;

public class PersonApp {

	public static void main(String[] args) {

		Person p = new Person("정우성", 45);
		Student01 s1 = new Student01("서울고등학교");
		Student01 s2 = new Student01("이정재", 45, "한국고등학교");
		p.showInfo();
		s1.showInfo();
		s2.showInfo();
		
	}

}
