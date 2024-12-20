package exercise01;

public class Rectangle {
	private Double width;
	private Double height;
	
	public Rectangle() {
		
	}

	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double Area() {
		return width * height;
	}
	public Double Perimeter() {
		return 2 * width + 2 * height;
	}
	public Double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
