package javaEx;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle() {
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

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
		double d = this.width * this.height;
		return d;
	}
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		if(this.hashCode()==r.hashCode()) {
			return true;
		}else if (this.area() == r.area()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
