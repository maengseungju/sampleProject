package javaEx;

public class Goods {
	private String name;
	private int price;

	public Goods() {
		
		
	}

	public Goods(int price, String name) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("상품이름 : "  + this.name);
		System.out.println("가격 : " + this.price);
		System.out.println("--------------------");
	}
}
