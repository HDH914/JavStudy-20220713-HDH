package j04_문자열;

public class String1 {
	public static void main(String[] args) {
		String address = "부산시 동래구 사직동";  //문자열에는 자라마다 인덱스가 있다.
		//indexOf(), lastIndexOf() : 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int index = address.indexOf("동");  
		int index2 = address.lastIndexOf("동");  
		System.out.println(index);
		
		//substring : 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subAddress1 = address.substring(index);	//시작점만 입력하면 나머지 뒤 전체가 출력됨
		String subAddress2 = address.substring(index, index2 + 1);
		System.out.println(subAddress1);
		System.out.println(subAddress2);
		
		//replace해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-'); //replace : 문자
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");  //replaceAll : 문자열
		System.out.println(replaceAddress);
		
		String phoneNumber = "010/1234/5678, 010/9876/5432";
		String rePhone = phoneNumber.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		
		String rePhone2 = phoneNumber.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		
	}
}
