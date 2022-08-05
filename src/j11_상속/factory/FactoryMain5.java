package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		/*
		 * Factory 배열 크기 20
		 * 배열의 인덱스가 짝수이면 Samsung 생성해서 대입
		 * 배열의 인덱스가 홀수이면 LG 생성해서 대입
		 * 
		 * 삼성공장 1~10
		 * LG공장 1~10
		 * */
		
		Factory[] factories = new Factory[20];
		
		for(int i = 0; i < factories.length; i++) {
			if(i % 2 == 0) {
				factories[i] = new Samsung((i/2)+1);  //삼성공장 생성		
				System.out.print("factories[" + i + "]: ");
				factories[i].start();
			} else if(i % 2 == 1) {
				factories[i] = new LG((i/2)+1);  //LG공장 생성
				System.out.print("factories[" + i + "]: ");
				factories[i].start();		
			}
		
		}
}
}