package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson3 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();  //Gson 객체 생성
		
		//Map을 Json으로 변환
		
		Map<String, Object> map =  new HashMap<String, Object>();  //Map 객체 생성
		map.put("code", 1);
		map.put("message", "json 형변환 테스트");
		map.put("data", user);
		
		String mapJson = gson.toJson(map);
		
		System.out.println(mapJson);
		
		
		//JSON을 Map으로 변환
		
		Map<String, Object> mapObj = gson.fromJson(mapJson, Map.class);
		
		System.out.println(mapObj);
		
		mapObj.replace("code",  ((Double)mapObj.get("code")).intValue());
		
		System.out.println(mapObj);
		
		
		
		
	}

}
