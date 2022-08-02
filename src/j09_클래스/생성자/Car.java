package j09_클래스.생성자;

public class Car {
	//필드
	String company;
	String model;
	String color;
	
	Car() {}  //기본 생성자	
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	void showCarInfo() {  //메소드
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
}
