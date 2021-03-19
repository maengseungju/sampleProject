package javaEx;

public class Triangle extends Shape {
	
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double area() {
		double t = this.width * this.height / 2;
		return t;
	}
	
	
}