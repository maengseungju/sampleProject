package javaEx;

public class ColorPoint extends Point {

	private String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super.setX(x);
		super.setY(y);
		this.setColor(color);
	}

	public ColorPoint(String color) {
		this.Color = color;
	}

	public void draw() {
		System.out.println("점[x= " + super.getX() + 
				", y= " + super.getY() + 
				", 색= " + this.getColor() + "]을 그렸습니다.");
	}
}
