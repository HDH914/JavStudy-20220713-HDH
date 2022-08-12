package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
//생성자 호출시에 객체 생성
public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}

	public void addUser() {
	
		//입력
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("이메일: ");	
		email = scanner.nextLine();
		
		//User 객체 생성
		User user = User.builder()
		.username(username)
		.password(password)
		.name(name)
		.email(email)
		.build();
		
		//userList에 add
		userList.add(user);
	}
	
	public void printUserList() { 
//		System.out.println(userList);
//		System.out.print("아이디\t>" + "\n비밀번호 >" + "\n이름\t>" + "\n이메일\t>");
		
		for(User user : userList) {
			System.out.println("아이디\t >" + user.getUsername());
			System.out.println("비밀번호 >" + user.getPassword());
			System.out.println("이름\t >" + user.getName());
			System.out.println("이메일\t >" + user.getEmail());
			System.out.println();
		}
		//userList 반환
		
		
	}
	
	public void removeUser() {
		String username = null;
		String password = null;
		
		//아이디 입력
		System.out.print("아이디: ");
		username = scanner.nextLine();   //아이디 입력 후 확인
		for(User user : userList) {
		if(user.getUsername().equals(username)) {
			System.out.print("비밀번호: ");
			password = scanner.nextLine();
			if(user.getPassword().equals(password)) {
				//회원 리스트에서 삭제
				userList.remove(user);
				System.out.println(user + "삭제완료");
				return;
			} else {
				System.out.println("비밀번호가 일치 하지 않습니다.");
				return;
			}
			}
		}
		System.out.println("일치하는 아이디가 없습니다.");
		
	}
	
	public static void main(String[] args) {
		UserArrayList userarrayList = new UserArrayList();
//		userarrayList.scanner.next();		
		/*
		 * [ 사용자 관리 프로그램 ]
		 * 1. 사용자 추가 
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * */
		while(true) {
			String select = null;
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가\n2. 사용자 리스트 출력\n3. 사용자 삭제\nq. 프로그램 종료");
			System.out.print("메뉴 선택> ");
			System.out.println();
			
			select = userarrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userarrayList.addUser();
			}else if(select.equals("2")) {
				userarrayList.printUserList();
			}else if(select.equals("3")) {
				userarrayList.removeUser();
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
			System.out.println("번호를 다시 입력해 주세요.");
			}
		}
				
	}
}
