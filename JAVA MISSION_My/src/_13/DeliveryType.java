package _13;

public class DeliveryType {
	// memberVar
	String name;
	
	// constructor
	DeliveryType(){
		
	} 
	
	DeliveryType(String name){
		this.name = name;
	}
	
	// memberMethod
	public String work() {
		return "기본";
		
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}