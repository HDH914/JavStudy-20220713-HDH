package j07_반복;

public class while4 {

	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		
		while(dan < 9) {
			while(num < 9) {
				num++;
				System.out.println(dan + " x " + num + " = " + (dan*num));
			}
			dan++;
		}
		
		
		
		//System.out.println(dan + " x " + num + " = " + (dan*num));
		
	}

}
