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
		System.out.println(dk.name + "(을/)를 마셨습니다.");
		dt.work();
	}
	
	public void powerUP(Drink drink) {
		power = drink.getPower();
		System.out.println("활력 : " + power);
	}
	
}