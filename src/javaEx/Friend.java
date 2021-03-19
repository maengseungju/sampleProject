package javaEx;

public class Friend {

	public String name;
	public String phoneNumber;
	public String school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Friend(String name, String phoneNumber, String school) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.school = school;
	}

	public Friend() {

	}

	public void show() {
		System.out.println("이름 : " + this.name + " 전화번호 : " + this.phoneNumber + " 학교 : " + this.school);
	}

}
