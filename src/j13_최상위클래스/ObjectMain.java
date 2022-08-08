package j13_최상위클래스;

public class ObjectMain {

	public static void main(String[] args) {
		Object object = new Object();
		
		Object test = new Test();
		
		
		((Test) test).testMethid();  //다운캐스팅후 메소드 실행
		
		
		
	}

}
