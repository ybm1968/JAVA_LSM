package _13;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("================ 배달수단 ================");
        	System.out.println("1. 도보\n2. 자전거\n3. 킥보드\n4. 오토바이");
        	System.out.println("========================================");
        	System.out.print("입력>> ");
        	int deliveryChoice = sc.nextInt();
        	ModooDriver md = new ModooDriver();
        	DeliveryType delivery;
        switch (deliveryChoice) {
            case 1:
                delivery = new Walker();
                break;
            case 2:
                delivery = new Bicycle();
                break;
            case 3:
                delivery = new KickBoard();
                break;
            case 4:
                delivery = new MotorCycle();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                sc.close();
                return;
        }

        System.out.println("================ 드링크 ================");
        System.out.println("1. 비타민음료\n2. 커피\n3. 에너지드링크\n0. 안 마심");
        System.out.println("========================================");
        System.out.print("입력>> ");
        int drinkChoice = sc.nextInt();

        Drink drink;
        switch (drinkChoice) {
            case 1:
                drink = new VitaminDrink("비타민 음료");
                break;
            case 2:
                drink = new Coffee("커피");
                break;
            case 3:
                drink = new EnergyDrink("에너지 드링크");
                break;
            case 0:
            	drink = new Drink("안마심");			// 0을 입력을 해도 나온다...
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                sc.close();
                return;
        }

        System.out.println(drink.name + "을(를) 마셨습니다.");
        System.out.println(delivery.work() + "(으)로 배달을 수행중입니다.");
       	System.out.println("활력 : " + drink.getPower());
       	System.out.println("\n");
        } while (true);
    }
}

/*
 	문제점
 	1. ModooDriver을 사용하지 않았다. 사실 어떤 용도로 사용되는건지 잘 모르겠다.
 	2. 
*/
