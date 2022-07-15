package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		//상수: 값이 바뀌지 않는 수. final을 선언하고 상수명은 전부 대문자로 작성한다.
		//리터럴 상수: 변수와는 달리 데이터가 저장된 메모리 공간을 가리키는 이름을 가지고 있지 않는다.
		//1. 정수형 리터럴 상수는 123, -456과 같이 아라비아 숫자와 부호로 직접 표현됩니다.
		//2. 실수형 리터럴 상수는 3.14, -45.6과 같이 소수 부분을 가지는 아라비아 숫자로 표현됩니다.
		//3. 문자형 리터럴 상수는 'a', 'Z'와 같이 따옴표('')로 감싸진 문자로 표현됩니다.
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		//MAX_NUMBER = 200;  위에서 초기화를 했으므로 값 변경 불가.
				
		int num = 10;
		num = 80;
		
		
		System.out.println("최소값: " + MIN_NUMBER);
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + num);
		
		
		
		
		
	}

}
