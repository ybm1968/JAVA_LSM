package Day07.EX01_Shape;

public class Circle extends Shape {

	double radius;
	
	public Circle() {
		this(0);
	}
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	// 원의 넓이 : 원주율 X 반지름 X 반지름
	@Override
	double area() {
		return radius * radius * Math.PI;
	}

	// 원의 둘레 : 2 X 원주율 X 반지름
	@Override
	double round() {
		return 2 * Math.PI * radius;
	}


	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
