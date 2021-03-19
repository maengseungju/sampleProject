package javaEx;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
//		Goods notebook = new Goods(900000, "lg그램");
//		Goods cup = new Goods(2000, "머그컵");
//		Goods fruit = new Goods(1000, "사과");
//		Goods fruit1 = new Goods(500, "바나나");
//		Goods fruit2 = new Goods(3000, "망고");

//		Goods fruit = new Goods();

//		camera.setName("nikkon");
//		camera.setPrice(400000);
//
//		camera.showInfo();
//		notebook.showInfo();
//		fruit.showInfo();
//		fruit1.showInfo();
//		fruit2.showInfo();
//		System.out.println(camera.getName());
//		System.out.println(camera.getPrice());
//
//		System.out.println(notebook.getName());
//		System.out.println(notebook.getPrice());
//
//		System.out.println(cup.getName());
//		System.out.println(cup.getPrice());
		
		Goods[] lgArr = new Goods[3];
		Goods[] mugArr = new Goods[5];
		
		for(int i = 0; i < lgArr.length; i++) {
			lgArr[i] = new Goods(900000, "LG그램");
			lgArr[i].showInfo();
		}
		for(int j=0; j<mugArr.length; j++) {
			mugArr[j] = new Goods(5000, "머그컵");
			mugArr[j].showInfo();
		}
		
		
	}

}
