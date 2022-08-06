package j12_다형성.factory;

import java.util.Scanner;

import j11_상속.factory.Factory;
import j11_상속.factory.LG;
import j11_상속.factory.Samsung;

public class FactoryMain {
	//결합도가 낮을수록 좋은 프로그램
	//응집도: 딱 필요한 기능들이 모여있는것. 높을수록 좋음.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Factory factory = null;
		
		String select = null; 
		
		System.out.println("1. 삼성공장");
		System.out.println("2. LG공장");
		System.out.println("공장을 선택하세요: ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			factory = new Samsung(1);
		}else {
			factory = new LG(1);
		}
		
		Samsung samsung = new Samsung(1);
		LG lg = new LG(1);
		
		
		FactoryService factoryService = new FactoryService(samsung);
		
		factoryService.factoryStart();
		factoryService.factoryStop();
		
	}

}
