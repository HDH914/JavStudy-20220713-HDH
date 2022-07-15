package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '하';
		char name2 = '덕';
		char name3 = '현';
		
		String address = "부산 동래구 사직동";
		int age = 29;
		
		
		System.out.print("이름: ");
		System.out.println(name1+name2+name3);  //문자의 합은 순서에 따라 변한다.
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("name1+name2+name3");
		System.out.print("나이: ");
		System.out.println(age+1);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println(""+name1+name2+name3);
		System.out.print("나이: ");
		System.out.println(age+2);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println((double)name1+name2+name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		System.out.println();
		
		System.out.println("결과: " + 10 + 20);
		System.out.println("결과: " + (10 + 20));
		
		}

}
