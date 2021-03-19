package javaEx;

public class StudentApp {

	public static void main(String[] args) {

		Student[] student = new Student[5];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student("202001", "홍길동", "남자", i + 10);

		}
		for (int i = 0; i < student.length; i++) {
			System.out.println("------------------");
			student[i].show();
		}

	}

}
