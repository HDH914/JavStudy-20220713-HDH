package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		//자동 형변환
		char a = '가';
		int  b = a;
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		//강제 형변환
		int d = (int) c;  //형변환시 변수명 띄어서 작성
		char e = (char) d;
				
		
		System.out.println(d);
		System.out.println(e);
	}

}
