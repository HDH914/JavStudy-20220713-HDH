package j11_상속.factory;

public class LG extends Factory{

	public LG(int factoryNumber) {
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.print("LG ");
		super.start();
	}
	
	public void produceSmartTv() {
		System.out.println("LG 스마트 TV를 생산합니다.");
	}


}

