package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
@Getter

public class UserArrayList2 {
	private List<User> userList;
	private Scanner scanner;
	
	//생성자
	public UserArrayList2() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);				
	}
	
	//사용자 추가
	public void addUser() {
		String userId = null;
		String userPassword = null;
		String userName = null;
		String userEmail = null;
		
		System.out.print("아이디: ");
		userId = scanner.nextLine();
		System.out.print("비밀번호: " );
		userPassword = scanner.nextLine();
		System.out.print("이름: " );
		userName = scanner.nextLine();
		System.out.print("이메일: " );
		userEmail = scanner.nextLine();
		
		//User객체 정보
		User user = User.builder()
				.username(userId)
				.password(userPassword)
				.username(userName)
				.email(userEmail)
				.build();
		
		//user 정보 저장
		userList.add(user);
	}
	
	
	//사용자 확인
	public void UserListInfomation() {
		for(User user: userList) {
			System.out.println("아이디: " + user.getUsername());
			System.out.println("비밀번호: " + user.getPassword());
			System.out.println("이름: " + user.getUsername());
			System.out.println("이메일: " + user.getEmail());
			System.out.println();
		}
	}
	
	
	
	
	//사용자 제거
	public void removeUser() {
		String userId = null;
		String userPassword = null;
		
		for(User user : userList) {
			System.out.println("아이디를 입력해주세요.");
			userId = scanner.nextLine();
			if(user.getName().equals(userId)) {
				System.out.println("비밀번호를 입력해 주세요.");				
				System.out.print("비밀번호: ");
				userPassword = scanner.nextLine();
				if(user.getPassword().equals(userPassword)) {
					System.out.println(user);
					System.out.println("회원 정보를 삭제했습니다.");
					userList.remove(user);
					return;
				}else {
					System.out.println("비밀번호가 맞지 않습니다.");
					return;
				}				
			}			
		}
		System.out.println("아이디가 맞지 않습니다.");
	}
	
	
	
	public static void main(String[] args) {
		UserArrayList2 userArrayList2 = new UserArrayList2();
				
		while(true) {	
			String select = null;
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가\n2. 사용자 리스트 출력\n3. 사용자 삭제\nq. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴 선택 : " );
			
			select = userArrayList2.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList2.addUser();
			}else if(select.equals("2")) {
				userArrayList2.UserListInfomation();
			}else if(select.equals("3")) {
				userArrayList2.removeUser();
				System.out.println();
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("번호를 잘못 입력하셨습니다.");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
