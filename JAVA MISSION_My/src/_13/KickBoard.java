package _13;

public class KickBoard extends DeliveryType {

	// constructor
	KickBoard(){
		
	}
	
	KickBoard(String name){
		super(name);
	}
	
	@Override
	public void work() {
		System.out.println(name + "(으/)로 배달을 수행중입니다.");
	}
}
