package j06_조건;

import java.util.Scanner;

public class If_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 12;
		int y = 5;
		String result = null;
		
		if(x == 0 || y == 0) {
			result = "(0,0)";
		}else if (x > 0 && y > 0) {
			result = "1";
		}else if (x < 0 && y > 0) {
			result = "2";
		}else if (x < 0 && y < 0) {
			result = "3";
		}else if (x > 0 && y < 0){
			result = "4";
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);
		
	}

}
