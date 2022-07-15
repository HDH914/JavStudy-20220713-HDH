package j03_연산자;

import java.util.Scanner;

public class Operation5 {
	public static void main(String[] args) {
		
		//시험 성적 결과 계산 프로그램
		//score = 85
		//1. score가 0보다 작거나 100보다 크면 계산 불가
		//2. 89보다 크면 A
		//3. 79보다 크면 B
		//4. 69보다 크면 C
		//5. 59보다 크면 D
		//6. 나머지 F
		//결과: 계산불가
		
		String result = null;
		int score = 85;		
				
		System.out.println("점수 :" + score);
		result = score < 0 || score > 100 ? "계산 불가"  
					: score > 89 ? "A"
					: score > 79 ? "B"
					: score > 69 ? "C"
					: score > 59 ? "D"
					: "F";
		System.out.print("시험 성적은: " + result);
		
		Scanner in = new Scanner(System.in);		
		int score1 = in.nextInt();		
		
		if(score1 < 101 && score1 >89) {
			System.out.println("시험 성적은: A");
		}else if(score1 < 89 && score1 >79) {
			System.out.println("시험 성적은: B");
		}else if(score1 < 79 && score1 >69) {
			System.out.println("시험 성적은: C");
		}else if(score1 < 69 && score1 >59) {
			System.out.println("시험 성적은: D");
		}else if(score1 < 59 && score1 > -1) {
			System.out.println("시험 성적은: F");
		}else {
			System.out.println("계산 불가");
		}
		
}
}
