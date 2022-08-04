package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scores 배열 5개
		 * */
		
		String[] names = {"박진관", "조문기", "서재효", "임나영", "전나경"};
		String[] studentYears = {"3학년", "2학년", "4학년", "3학년", "4학년"};
		double[] scores = {75.9, 50.5, 85.7, 88.3, 78.5};
		
				
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i]+ "\t" + studentYears[i] + "\t" + scores[i] + "점");
		}
		
		
		Student[] student = new Student[5];
		student[0] = new Student("김준일", 3, 29 ,"부산", "010-9988-1916");
		
		for(int i = 0; i < 5; i++) {
			if(student[i] != null) {
			System.out.println("이름: " + student[i].getName());
			}
		}
		
		
		
		
		
	}

}
