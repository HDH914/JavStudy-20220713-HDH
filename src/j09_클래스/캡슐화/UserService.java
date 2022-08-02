package j09_클래스.캡슐화;

import java.net.PasswordAuthentication;
import java.util.Scanner;

import javax.print.attribute.standard.JobOriginatingUserName;

public class UserService {
	
	private User user;
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);		
	}
	
	public void addUser() {
		String userName= null;
		String password = null;
		String name = null;
		String email = null;
		System.out.println("아이디: ");
		userName = scanner.nextLine();
		if(isStrBlank(userName)) {
			return;
		}
		
		
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		if(isStrBlank(password)) {
			return;
		}
		
		System.out.println("이름: ");
		name = scanner.nextLine();
		if(isStrBlank(name)) {
			return;
		}
		
		System.out.println("이메일: ");
		email = scanner.nextLine();
		if(isStrBlank(email)) {
			return;
		}
	}
	
	private boolean isStrBlank (String str) {
		return str == null || str.isBlank();
	}
}
