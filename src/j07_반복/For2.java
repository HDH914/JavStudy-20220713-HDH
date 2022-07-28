package j07_반복;

public class For2 {

	public static void main(String[] args) {
		int dan = 2;
		
		for(int i = 0; i < 9; i++) {			
			int num = i + 1;
			System.out.println(dan + " x " + num + " = " + (dan * num));
		}
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " +  j +" = " + (i * j));
			}
			if(i < 9) {
			System.out.println();
			}
		}
		
	}

}
