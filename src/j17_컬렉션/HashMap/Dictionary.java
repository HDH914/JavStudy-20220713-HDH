package j17_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import j17_컬렉션.ArrayList.User;

public class Dictionary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		List<String> arrayList = new ArrayList<String>();
		Map<String, String> dict = new HashMap<String, String>();
		
		//값 추가   put: 추가하는거
		dict.put("축구", "soccer");
		dict.put("야구", "baseball");
		dict.put("농구", "basketball");
		dict.put("골프", "golf");
		
		Map<String, User> userDict = new HashMap<String,User>();
		String username = "";
		userDict.put(username, User.builder().username(username).password("1234").build());
		
		if(userDict.containsKey("aaa")) {   //containsKey:   찾는거
			System.out.println(userDict.get("aaa"));
		}
				
		String searchText = null;
		
		while(true) {
			System.out.println("[ 사전 검색 기능 ]");
			System.out.println("프로그램 종료 명령(exit)");
			System.out.print("검색어: ");
			searchText = scanner.nextLine();
			
			if(searchText.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(dict.containsKey(searchText)) {
				System.out.println(dict.get(searchText));  //get: 받는거 
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			System.out.println();
		}
				
		//일반 버전
//		while(true) {
//			System.out.println("[ 사전 검색 기능 ]");
//			System.out.println("프로그램 종료 명령(exit)");
//			System.out.print("검색어: ");
//			searchText = scanner.nextLine();
//			if(searchText.equals("exit")) {
//				System.out.println("프로그램 종료");
//				break;
//			}else if(searchText.equals("축구")) {
//				System.out.println("soccer");
//			}else if(searchText.equals("야구")) {
//				System.out.println("baseball");
//			}else if(searchText.equals("농구")) {
//				System.out.println("basketball");
//			}else if(searchText.equals("골프")) {
//				System.out.println("golf");
//			}else {
//				System.out.println("지원하지 않는 단어입니다.");
//			}
//			System.out.println();
//		}
		
		/*
		 * 한글을 입력하면 영어단어로 출력
		 * 축구 ->soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf 
		 * */
		
	}

}
