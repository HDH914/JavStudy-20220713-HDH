package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		//업캐스팅 : 상속 관계가 있고 부모가 가지고 있는 메소드는 사용가능.
		//			 자식 객체들을 배열로 사용가능.
		//			 자식 메소드는 사용 불가.
		Factory factory1 = new Samsung(1);
		Factory factory2 = new LG(1);
		
		Factory[] factories = new Factory[4];
		factories[0] = new Samsung(1);
		factories[1] = new LG(1);
		factories[2] = new Samsung(2);
		factories[3] = new LG(2);
		factories[4] = new Samsung(3);
		factories[5] = new LG(3);
		factories[6] = new Samsung(4);
		factories[7] = new LG(4);
		
		System.out.println("모든 공장을 가동합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		
		System.out.println("모든 공장을 중지합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
	}

	

}
