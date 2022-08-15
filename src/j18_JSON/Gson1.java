package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		//Gson 객체 생성 방법
		//1.Gson() 생성자 통해 성성
		Gson gson1 = new Gson();  // 첫번째 객체 생성 방법
		
		//2.GsonBuilder() 생성자를 통해 생성
		Gson gson2 = new GsonBuilder().create();  //두 번째 객체 생성 방법
		
		
		//JSON 이쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "HDH");
		map.put("password", "1234");
		map.put("name", "HDH");
		map.put("email", "HDH@naver.com");
		
		String json1 = gson3.toJson(map);   //pretty 적용
		String json2 = gson2.toJson(map);	//pretty 미적용
		
		System.out.println(gson1.toString());
		System.out.println(json1);
	}

}
