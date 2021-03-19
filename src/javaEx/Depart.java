package javaEx;

public class Depart extends Employee {

	private String department;

	public String getDepartment() {
		return department;
	}

	public Depart(String department) {
		super();
		this.department = department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Depart(String name, int salary, String department) {
		super.setName(name);
		super.setSalary(salary);
		this.setDepartment(department);
	}
    public void getInformation() {
        System.out.println("이름: " + super.getName() + 
        		           " 연봉: " + super.getSalary() + 
        		           " 부서: " + this.department);
    }

	// 코드작성

}
