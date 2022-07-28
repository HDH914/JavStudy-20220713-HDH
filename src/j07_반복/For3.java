package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * */
		
		String str = "abcdefghijk";
		for(int i = 0; i < str.length(); i++) {
			String index = str.substring(i, i + 1);
			System.out.println(index);
		}
	}

}
