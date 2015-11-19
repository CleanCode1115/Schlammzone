package de.integrata.oop.sz.constructors;

public class Point {

	private int x,y;

	private Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private Point(float distance, float angle) {
		
	}
	
	public static Builder createWithAngle(float angle) {
		return new Builder(angle);
	}
	
	static class Builder {
		private float angle;
		
		public Builder(float angle) {
			this.angle = angle;
		}
		
		public Point andDistance(float distance) {
			return new Point(distance, angle);
		}
	}
	
	
}
