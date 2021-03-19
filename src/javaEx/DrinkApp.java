package javaEx;

public class DrinkApp {

	public static void main(String[] args) {

		Drink d1 = new Drink("coffee", 2000);
		Drink d2 = new Drink("juice", 3000);

		d1.showInfo();
		d2.showInfo();
	}

}
