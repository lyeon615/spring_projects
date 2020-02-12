package com.javalec.ex;

public class MyCircle {
	private int radius;
	private int width;
	private int height;

	private Area area;
	
	public void circle() {	
		area.circleArea(radius);
	}
	
	public void square() {
		area.squareArea(width, height);
	}
	
	public void triangle() {
		area.triangleArea(width, height);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
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
	
}
