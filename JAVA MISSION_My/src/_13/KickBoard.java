package _13;

public class KickBoard extends DeliveryType {

	// constructor
	KickBoard(){
		
	}
	
	KickBoard(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "킥보드";
	}
}
