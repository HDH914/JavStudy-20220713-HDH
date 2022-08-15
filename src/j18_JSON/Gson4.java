package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "HDH");
		jsonObject.addProperty("age", 28);
		jsonObject.addProperty("adrress", "부산");
		jsonObject.addProperty("phone", "010-6651-6545");
		
		
		String json = gson.toJson(jsonObject);
		
		System.out.println(json);
		System.out.println();
		
		JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
		
		
	}

}
