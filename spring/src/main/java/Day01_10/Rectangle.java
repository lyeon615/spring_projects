package Day01_10;

public class Rectangle {
	private double area;
	private int width;
	private int heigth;
	
	public Rectangle() {
		
	}

	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
		area = width * heigth;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
