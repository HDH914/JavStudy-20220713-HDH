package j17_컬렉션.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
	public static Map<String, String> addUser(){ 	 //Map 형식 addUser 메소드 생성
		Scanner scanner = new Scanner(System.in);	 //개인 정보를 입력할 스캐너 생성
		Map<String, String> user = new HashMap<String, String>();	//유저 정보를 담을  Map생성
		
		//유저 정보 추가
		System.out.println("아이디: ");
		user.put("username", scanner.nextLine());
		System.out.println("비밀번호: ");
		user.put("password", scanner.nextLine());
		System.out.println("이름: ");
		user.put("name", scanner.nextLine());
		
		return user;
	}
	public static void main(String[] args) {
	Set<Map<String, String>> userSet = new HashSet<Map<String, String>>();  //
	
	//유저 정보 추가 메소드 실행
	userSet.add(addUser());
	userSet.add(addUser());
	userSet.add(addUser());
	userSet.add(addUser());
	userSet.add(addUser());
	
	
	userSet.forEach(map -> {
		System.out.println("아이디: " + map.get("username"));
		System.out.println("비밀번호: " + map.get("password"));
		System.out.println("이름: " + map.get("name"));
	});
	}

}
