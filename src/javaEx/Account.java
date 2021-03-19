package javaEx;

public class Account  {

	private String accountNo;
	private int balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public Account(String string) {
		this.accountNo = string;
	}

	public Account() {
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void showBalance() {
		System.out.println(balance);
	}

	// 생성자 작성

	// 필요한 메소드 작성

}
