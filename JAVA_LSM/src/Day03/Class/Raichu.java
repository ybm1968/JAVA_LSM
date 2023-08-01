package Day03.Class;

public class Raichu extends Pikachu{

	public Raichu() {
		super(200, "슈퍼전기", 20);
		
	}

	public Raichu(int energy, String type, int level) {
		super(energy, type, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		if(level >= 40)
			return "아이언테일";
		else
			return "사용불가";
	}
	
	 
}
