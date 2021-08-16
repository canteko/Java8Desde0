package interfaces;

import java.awt.Point;

public class RectanglePlus implements Relatable, MyInterface {
	
	public int width = 0;
	public int height = 0;
	public Point origin;

	public RectanglePlus() {
		this.origin = new Point(0, 0);
	}
	
	public RectanglePlus(Point origin, int width, int height) {
		this.width = width;
		this.height = height;
		this.origin = origin;
	}
	
	public RectanglePlus(int width, int height) {
		this.width = width;
		this.height = height;
		this.origin = new Point(0, 0);
	}
	
	public RectanglePlus(Point origin) {
		this.origin = origin;
	}
	
	 public void move(int x, int y) {
		 this.origin.x = x;
		 this.origin.y = y;
	 }
	 
	 public int getArea() {
		 return width * height;
	 }
	 

	@Override
	public int isLargerThan(Relatable other) {
		RectanglePlus otherRect = (RectanglePlus) other;
		if(this.getArea() > otherRect.getArea()) {
			return 1;
		} else if(this.getArea() < otherRect.getArea()) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return "RectanglePlus [width=" + width + ", height=" + height + ", origin=" + origin + "]";
	}

}
