package j07_반복;

public class DoubleWhile1 {

	public static void main(String[] args) {
		int i = 0;  //i교시

		while (i < 4) {
			i++;
			System.out.println(i + "교시");
			
			int j = 0;  //j분
			while (j < 50) {
				j++;
				System.out.println("\t" + j + "분");
				
				if (j == 50) {
					System.out.println("\t10분 쉬는시간");
				}
			}
		}

	}

}
