package j16_제네릭;

import j14_lombok.Car;

public class GenericMain {
	//생성하는 시점에 자료형을 바꿔줄수 있다.
	//제네릭으로 일반 자료형은 사용 불가
	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>();
		GenericTest<String, Car> genericTest2 = new GenericTest<String, Car>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");  //기존 String에서 int형으로 변경
		
	}

}
