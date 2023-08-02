package Day07.EX01_Shape;

// 추상클래스
// 추상 메소드와 함께 일반 메소드도 같이 정의 가능하다
public abstract class Shape {

	Point point;
	
	// 넓이, 둘레 메소드 원형 정의
	// 추상 메소드 : {} 블록 없이 메소드의 '틀' 만 정의하고 자식 클래스에서 반드시 오버라이딩 해야한다.
	// 형식 : abstract 반환타입 메소드명 (매개변수);
	
	abstract double area();		// 넓이
	abstract double round();	// 둘레
	
	
	// getter, setter
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
}
