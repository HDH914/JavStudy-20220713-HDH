package j09_클래스;

public class Car {
	String company;
	String model;
	String color;	
	
	Car() {  //기본 생성자 
		//생성자는 무조건 '주소값'만을 리턴한다.
		//클래스랑 생성자는 이름이 똑같다.
		System.out.println("생성자 호출\n");
	}
	
	void showCarInfo() {  //메소드
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
}
