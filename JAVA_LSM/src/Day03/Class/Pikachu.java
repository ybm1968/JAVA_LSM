package Day03.Class;

public class Pikachu {
	
		// 변수
		public int energy;
		public String type;
		public int level;
		
		// 기본 생성자
		public Pikachu() {
			this(100, "전기" ,1);
//			energy = 100;
//			type = "전기";
//			level = 1;
		}
		
		// 생성자 자동완성
		// alt + shift + S -> O
		public Pikachu(int energy, String type, int level) {
			this.energy = energy;
			this.type = type;
			this.level = level;
		}

		// 메소드
		public String aAttack() {
			return "십만볼트";
		}
		
		
		public String bAttack() {
			return "전광석화";
		}

		@Override
		public String toString() {
			return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
		}
		
		
	}
