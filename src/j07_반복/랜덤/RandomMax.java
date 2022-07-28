package j07_반복.랜덤;

import java.util.Random;

public class RandomMax {

	public static void main(String[] args) {
		
	/*
	 * random 클래스
	 * nextBoolean()
	 * nextInt()
	 * 
	 * */
		
		Random random = new Random();
//		int rNum = random.nextInt(10);  //(n): n까지의 숫자까지 범위가 지정됨
//		System.out.println(rNum);
		
		
		int i = 0;
		int temp = 0;
		
		while(i < 10) {
			int rNum = random.nextInt(10);
			System.out.println("현재 temp의 값: " + temp);
			System.out.println("새로 생성된 값: " + rNum);
			System.out.println();
			if(i == 0) {
				temp = rNum;
			}else {
				if(temp < rNum) {
					temp =rNum;
				}
			}
			i++;
		}
		System.out.println("최대값: " + temp);
		
		
		
		
		
		
		
		
		
	}

}
