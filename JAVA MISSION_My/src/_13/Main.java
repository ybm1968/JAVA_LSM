package _13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ModooDriver md = new ModooDriver();

		System.out.println("================ 배달수단 ================");
		System.out.println("1. 도보\n2. 자전거\n3. 킥보드\n4. 오토바이");
		System.out.println("========================================");
		System.out.print("입력>> ");
		int deliveryChoice = sc.nextInt();
		DeliveryType dt = null;
		
		switch (deliveryChoice) {
		case 1:
			dt = new Walker("도보");
			break;
		case 2:
			dt = new Bicycle("자전거");
			break;
		case 3:
			dt = new KickBoard("킥보드");
			break;
		case 4:
			dt = new MotorCycle("오토바이");
			break;
		default:
			System.out.println("잘못된 선택입니다.");	
			
		}
		
		
		System.out.println("================ 드링크 ================");
		System.out.println("1. 비타민음료\n2. 커피\n3. 에너지드링크\n0. 안 마심");
		System.out.println("========================================");
		System.out.print("입력>> ");
		int drinkChoice = sc.nextInt();
		Drink dk = null;

		switch (drinkChoice) {
		case 1:
			dk = new VitaminDrink("비타민음료");
			break;
		case 2:
			dk = new Coffee("커피");
			break;
		case 3:
			dk = new EnergyDrink("에너지드링크");
			break;
		case 0:
			dk = new Drink();
			md.drive(dt);
			md.powerUP(dk);
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}
		if( drinkChoice != 0 ) {
			md.drive(dt, dk);
			md.powerUP(dk);
			
		}
		
		sc.close();
	}
}

