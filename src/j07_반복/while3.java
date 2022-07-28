package j07_반복;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int i = 0;
		
		while(i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		System.out.println();
		///////////////////////////////////////////////
		
		i = 0;
		while(i < n) {
			System.out.println("i = " + (n-i));
			i++;
		}
		
		
		
		
		
		
		
//		i = 9;
//		while(i < n && i > 0) {
//			System.out.println("i = " + (i));
//			i--;
//		}					
		
	}

}
