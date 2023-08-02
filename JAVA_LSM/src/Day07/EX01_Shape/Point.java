package Day07.EX01_Shape;

public class Point {

		int x, y;
		
		// 기본 생성자
		public Point() {
			this(0, 0);
		}

		
		// alt + shift + S
		// 매개 변수 생성자
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}


		// toString()
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
		
	
		
		
			
}

