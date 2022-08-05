package j11_상속.factory;

public class Samsung extends Factory{

	//super : 부모객체
	
	public Samsung(int factoryNumber) {
		super(factoryNumber);
	}
		
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}
}
