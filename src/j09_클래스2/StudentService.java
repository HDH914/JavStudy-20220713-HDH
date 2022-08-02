package j09_클래스2;

import java.util.Scanner;

public class StudentService {
	private Scanner scanner;
	private Student[] studentArray;
	
	//전체 생성자
	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;
		this.scanner = new Scanner(System.in);
	}
	
	
	//메소드
	public Student addStudent() {
		return null;
	}
	
	public Student inputStudnet() {
		String studenName = null;
		int studentYear = 0;
		String studentAdrress = null;
		String studentPhone = null;
		System.out.println("[학생 등록]");
		System.out.print("이름>> ");
		studenName = scanner.nextLine();
		
		System.out.print("학년>> ");
		studentYear = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소>> ");
		studentAdrress = scanner.nextLine();
		
		System.out.print("연락처>> ");
		studentPhone = scanner.nextLine();
		return null;
	}
	
}
