package de.integrata.oop.sz.names;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(float angle, float distance) {
		
	}
	
	public static Point createFromAngleAndOffset(float angle, float distance) {
		return new Point(angle, distance);
	}
	
	
	public static void main(String[] args) {
		
		//Point.buildWith().angle(10f).distance(2f).andReturn();
		
		new Point(10,10);
		new Point(10f,10f);
		Point.createFromAngleAndOffset(10f, 10f);
		
		new Point(10,10f);
		
	}
	
	
}
