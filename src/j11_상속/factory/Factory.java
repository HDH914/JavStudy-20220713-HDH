package j11_상속.factory;

public class Factory {  //접근제한자에 따라 상속가능
	private int factoryNumber;
		  
	public Factory(int factoryNumber) {  //전체 생성자
		this.factoryNumber = factoryNumber;
	}
	
	public void start() {
		System.out.println(factoryNumber + "공장 가동");
	}
	
	public void stop() {
		System.out.println(factoryNumber + "공장 멈춤");
	}
}
