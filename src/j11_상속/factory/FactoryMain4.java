package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		//업캐스팅 : 상속 관계가 있고 부모가 가지고 있는 메소드는 사용가능. 자식 메소드는 사용 불가.
		//			 자식 객체들을 배열로 사용가능.
			 
		
		Factory[] factories = new Factory[4];
		factories[0] = new Samsung(1);
		factories[1] = new LG(1);
		factories[2] = new Samsung(2);
		factories[3] = new LG(2);
		
		int num = 10;
		double dNum = num;
		
		int n = (int) dNum;
		
		Samsung sFactory = new Samsung(1);
		Factory f = (Factory) sFactory;
		
		System.out.println(f);
		
		
		Samsung sf= (Samsung) f;   //다운 캐스팅
		
		
	}

	

}
