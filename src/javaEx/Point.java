package javaEx;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
	}

	public void draw() {
		System.out.println("점[x= " + this.x + ", y= " + this.y + "]을 그렸습니다.");
	}
	public void draw(int a) {
		System.out.println("점[x= " + this.x + ", y= " + this.y + "]을 지웠습니다.");
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		if(this.hashCode()==p.hashCode()) {
			return true;
		}else if (this.x == p.x && this.y == p.y) {
			return true;
		}else {
			return false;
		}
	}
	
}
