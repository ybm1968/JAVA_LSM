package _13;

public class ModooDriver {

	int power;

	// con
	public ModooDriver() {
		
	}
	
	public ModooDriver(int power) {
		this.power = power;
	}
	
	public void drive(DeliveryType deliveryName) {
		DeliveryType dt = deliveryName;
		dt.work();
	}
	
	public void drive(DeliveryType deliveryName, Drink drinkName) {
		DeliveryType dt = deliveryName;
		Drink dk = drinkName;
		dt.work();
		dk.getPower();
	}
	
	public void powerUP(Drink drink) {
		power = drink.getPower();
	}
	

	// 이 조건을 사용하지 않았어...
//	final public void template() {
//		drive(DeliveryType name)
//		drive(DeliveryType, Drink); 
//		powerUp(Drink);
//	}	
}