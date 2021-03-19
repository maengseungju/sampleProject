package javaEx;

public class Book {

	public int bookNo;
	public String title;
	public String author;
	public int stateCode;

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 대여 되었습니다.");
		
	}

	public void print() {
		String s = (this.stateCode == 0) ? "대여중" : "재고있음"; 
		System.out.println(this.bookNo + " 책제목 : " + this.title + 
				           ", 저자 : " + this.author + ", 대여유무 : " + s);
	}
	

}
