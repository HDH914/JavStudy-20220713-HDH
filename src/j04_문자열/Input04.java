package j05_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력해주세요: (여러명 가능)
		 * names = 김준일 강민지 박진관 오유리 조문기 (nextLine)
		 * phones = 9988 1916, 1234 5678, 1111 2222 (nextLine)
		 * ~~~님으로 출력이 되도록
		 * 010-9988-1916/010-~~~~~/010-~~~ 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		String names = null;
		String phones = null;
		
		System.out.println("이름을 입력해주세요: (복수 가능)");
		names = scanner.nextLine();
		System.out.println("연락처를 입력해주세요: (복수 가능)");
		phones = scanner.nextLine();
		
		names = names.replaceAll(" ", "님, ") + "님";
		phones = "010-" + phones.replaceAll(", ", "/010-")
				.replaceAll(" ", "-")
				.replaceAll("/", " ");
		System.out.println(names);
		System.out.println(phones);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.print("이름을 입력해주세요:");		
//		String names = scanner.nextLine();
//		System.out.print("전화번호를 입력해주세요:");			
//		String phones = scanner.nextLine();
//		
//		System.out.println(names + "님");
//		phones = phones.replaceAll(" ", "-");
//		System.out.println("010-" + phones);
		
		

		
		
		
		
		
		
	}

}
