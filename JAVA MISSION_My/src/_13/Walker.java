package _13;

public class Walker extends DeliveryType {

	// constructor
	Walker(){
		
	}
	
	Walker(String name){
		super("도보");
	}

	@Override
	public String work() {
		return "도보";
	}
}
