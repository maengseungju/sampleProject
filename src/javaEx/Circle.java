package javaEx;

public class Circle extends Shape {

	private int radius;

	public Circle() {

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return radius * radius * 3.14;
	}

}
