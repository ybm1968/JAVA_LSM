package _13;

public class Drink {
	String name;
	
	// constr
	Drink(){
	}

	Drink(String name) {
		this.name = name;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// method
	public int getPower() {
		return 0;
	}	
}