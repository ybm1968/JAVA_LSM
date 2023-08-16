package _13;

public class Coffee extends Drink {

	Coffee(){
		
	}
	
	Coffee(String name){
		super(name);
	}

	@Override
	public int getPower() {
		return 200;
	}
}