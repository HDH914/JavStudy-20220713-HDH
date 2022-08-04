package j10_배열;

public class Array2 {

	public static void main(String[] args) {
		//방법 1
		int[] numbers = new int[10];
		numbers[0] = 1;


		
		
		//방법 2
		int[] numbers2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//방법 3
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//방법4
		int[] numbers4 = new int [1000];
		
		for(int i = 0; i <numbers4.length; i++) {
			numbers4[i] = i + 1;
		}
		for(int i = 0; i <numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}
		
		
		}

}
