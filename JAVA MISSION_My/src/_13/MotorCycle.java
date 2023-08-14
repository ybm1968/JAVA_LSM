package _13;

public class MotorCycle extends DeliveryType {

	// constructor
	MotorCycle(){
		
	}
	
	MotorCycle(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "오토바이";
	}
}
