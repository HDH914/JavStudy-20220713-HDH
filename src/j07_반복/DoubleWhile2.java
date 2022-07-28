package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 5) {
			System.out.println("i= " + i);
			
			int j = 0;
			while(j < 9) {
				System.out.println("\tj= " + j);
				j++;
			}
			
			i++;
		}
	}
}
