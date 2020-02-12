package com.javalec.ex;

public class Area {
	
	public void circleArea(int radius) {
		System.out.print("circleArea : ");
		double area = (double)(2*radius*Math.PI);
		System.out.println(area);
	}
	
	public void squareArea(int width, int height) {
		System.out.print("squareArea : ");
		int area = width*height;
		System.out.println(area);
	}
	
	public void triangleArea(int width, int height) {
		System.out.print("triangleArea : ");
		double area = (double)(width*height/2);
		System.out.println(area);
	}
}
