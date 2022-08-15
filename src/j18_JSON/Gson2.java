package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
				.serializeNulls()	 //.serializeNulls() null 보이게 해줌
				.setPrettyPrinting()
				.create();  //Gson 객체 생성 
		
		//객체를 Gson으로 변환  -> toJson(객체)
		String userJson = gson.toJson(user);  //Json 형태로 변경
		
		System.out.println(userJson);
		System.out.println();
		
		//Json을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);  
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
		
		
		
		
		
		
	}

}
