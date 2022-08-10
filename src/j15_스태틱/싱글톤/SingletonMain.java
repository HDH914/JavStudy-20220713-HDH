package j15_스태틱.싱글톤;

public class SingletonMain {
	/*
	 * 싱글톤: 유일한 객체를 만들어서 공유하는 생성패턴
	 * 특징1 : 생성자는 접근지정자가 private다. 
	 * 특징2 : 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 가진 static변수가 필요하다.
	 * 특징3 : instance변수를 return(공유)해줄 getInstance 스태틱 메소드가 필요하다.
	 * */
	public static void main(String[] args) {
		KIA kia = KIA.getInstance();
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		
		System.out.println(kia.produceCar("k3"));
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		Test3 test3 = new Test3();
		
	}
}
