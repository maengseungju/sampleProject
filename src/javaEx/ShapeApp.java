package javaEx;

public class ShapeApp {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("반지름이 " + c.getRadius() + 
				           "인 원의 면적은 " + c.area());
		
		Rectangle r = new Rectangle();
		r.setHeight(4);
		r.setWidth(5);
		System.out.println("(가로, 세로)("+ 
		                   r.getWidth() + ","+ r.getHeight() +
		                   ") 사각형의 면적은 " + r.area());
		
		Triangle t = new Triangle();
		t.setHeight(4);
		t.setWidth(5);
		System.out.println("(밑변, 높이)("+ 
		                   t.getWidth() + ","+ t.getHeight() +
		                   ") 각형의 면적은 " + t.area());
		
		
		Rectangle a =  new Rectangle(6,4);
		Rectangle b =  new Rectangle(2,12);
		Rectangle c1=  new Rectangle(3,3);
		Rectangle d =  c1;
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c1));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c1));
				
	}
	
	

}
