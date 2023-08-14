package _13;

public class EnergyDrink extends Drink{

	EnergyDrink(){
		
	}
	
	EnergyDrink(String name){
		super(name);
	}

	@Override
	public int getPower() {
		return 150;
	}
}
