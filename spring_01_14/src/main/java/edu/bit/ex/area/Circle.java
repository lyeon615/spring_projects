package edu.bit.ex.area;

public class Circle {
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (double)(2*radius*Math.PI);
	}	
}
