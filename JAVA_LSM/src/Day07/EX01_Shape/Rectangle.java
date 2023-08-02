package Day07.EX01_Shape;

public class Rectangle extends Shape {

	double width, height;
	
	// 기본 생성자
	public Rectangle () {
		this(0, 0);
	}
	
	// 매개변수 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	// 넓이 : 가로 x 세로
	@Override
	double area() {
		return width * height;
	}

	// 둘레 : (가로 + 세로) * 2
	@Override
	double round() {
		return (width + height) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


}
