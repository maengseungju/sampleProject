package javaEx;

public class Student01 extends Person{
	
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student01(String schoolName) {
		super();
		this.schoolName = schoolName;
		
	}

	public Student01(String name, int age, String schoolName) {
		super.setName(name);
		super.setAge(age);
		this.setSchoolName(schoolName);
	}
	public void showInfo() {
		System.out.println("이름 : " +super.getName() + 
				", 나이 : " + super.getAge() + 
				", 학교 : " + this.schoolName);
	}
	


}
