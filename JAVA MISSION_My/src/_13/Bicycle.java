package _13;

public class Bicycle extends DeliveryType{

	// constructor
	Bicycle(){
		
	}
	
	Bicycle(String name){
		super(name);
	}

	@Override
	public String work() {
		return "오토바이";
	}
}