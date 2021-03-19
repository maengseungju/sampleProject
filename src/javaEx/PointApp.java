package javaEx;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		//Point p2 = new Point(10,23);
		Point b = p1;
		
		p1.draw();
		//p2.draw();
		
//		p1.draw(1);
//		p2.draw(1);
		ColorPoint c1 = new ColorPoint("red");
		c1.draw();
		ColorPoint c2 = new ColorPoint(10,10,"blue");
		c2.draw();
		
		System.out.println("---------------------------------");
		System.out.println("hashCode : " + p1.hashCode());
		System.out.println("getClass : " + p1.getClass());
		System.out.println("getClass, getName : " + p1.getClass().getName());
		System.out.println("toString : " + p1.toString());
		System.out.println("p1 : " + p1);
		
		System.out.println("---------------------------------");
		System.out.println("hashCode : " + b.hashCode());
		System.out.println("getClass : " + b.getClass());
		System.out.println("getClass, getName : " + b.getClass().getName());
		System.out.println("toString : " + b.toString());
		System.out.println("b : " + b);
	
		System.out.println(p1.equals(b));
	}
	
	

}
