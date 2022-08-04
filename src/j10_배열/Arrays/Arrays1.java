package j10_배열.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays1 {

	public static void main(String[] args) {
		/*
		 * Arrays 클래스 사용법
		 * -배열을 관리해주는 객체
		 * 
		 * 1.배열의 내용을 검색 후 인덱스를 반환받는 방법
		 * -binarySearch(찾고자 하는 값)
		 * 
		 * 2.배열을 복사할 때 사용하는 메소드
		 * -copyOf(복사하고자 하는 배열, 새로 생성할 배열의 크기)
		 * 
		 * 3.배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 * -copyOfRange(복사하고자 하는 배열, 시작 인덱스, 마지막 인덱스)
		 * 
		 * 4.배열을 초기화 하고 원하는 값으로 모두 채우는 메소드
		 * -fill(초기화 하고자 하는 배열, 채울 값)
		 * 		 
		 * 5.배열을 정렬하는 방법
		 * -sort(정렬하고자 하는 배열)
		 * 
		 * */
		
		int[] numbers = {1, 5 ,6, 8 ,3 ,4, 9, 7, 2};
		
		int[] numbers2 = numbers;
		
		int[] newArr = new int[9];
		
		System.out.print("newArr: [");
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = numbers[i];			
			System.out.print(newArr[i]);
			if(i != newArr.length - 1) {
				System.out.print(", ");
			}			
		}
		System.out.println(" ]");
		
		
		printArray(numbers);
		//얕은 복사
		printArray(numbers2);
		
		
		//깊은 복사 1
		int[] numbers3 = new int[numbers.length];
		for(int i = 0; i < numbers.length; i ++) {
			numbers3[i] = numbers[i];
		}
		printArray(numbers3);
		numbers3[0] = 200;
		printArray(numbers3);
		
		//깊은 복사 2
		int[] numbers4 = Arrays.copyOf(numbers, numbers.length);
		printArray(numbers4);
		
		int[] numbers5 = Arrays.copyOfRange(numbers, 1, 5);
		printArray(numbers5);
		
		//오름차순
		Arrays.sort(numbers4);
		printArray(numbers4);
	
		//내림차순
		Integer[] numArray = {1, 2, 3, 4, 5 }; 
		Arrays.sort(numArray, Collections.reverseOrder());
		printArray(numArray);
		
		
		//배열 초기화 후 채우기
		Arrays.fill(numbers5, 10);
		printArray(numbers5);
		
		//값의 위치 찾기
		Arrays.sort(numbers);
		int index = Arrays.binarySearch(numbers, 5);  //먼저 정렬을 한 후 binarySearch사용
		printArray(numbers);
		System.out.println("찾은 인덱스: " + index);
		
	}
	
	public static void printArray(int[] arr) {
		System.out.print("Array: [ ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); 
			
			if(i != arr.length - 1) {
				System.out.print(", ");
			}			
		}
		System.out.print(" ]\n");
	}
	
	public static void printArray(Integer[] arr) {
		System.out.print("Array: [ ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i != arr.length - 1) {
				System.out.print(", ");
			}			
		}
		System.out.print(" ]\n");
	}
	
	
}
