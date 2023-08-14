package _13;

public class VitaminDrink extends Drink{

	VitaminDrink(){
		
	}
	
	VitaminDrink(String name){
		super(name);
	}

	@Override
	public int getPower() {
		return 50;
	}
}
