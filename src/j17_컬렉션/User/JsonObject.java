package j17_컬렉션.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {

	public static void main(String[] args) {
		Map<String , Object> map =new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> dataList1 = new HashMap<String, Object>();		
		dataList1.put("name", "bulbasaur");
		dataList1.put("url", "https://pokeapi");
		
		Map<String, Object> dataList2 = new HashMap<String, Object>();		
		dataList2.put("name", "ivysaur");
		dataList2.put("url", "https://pokeapi");
		
		Map<String, Object> dataList3 = new HashMap<String, Object>();		
		dataList3.put("name", "venusaur");
		dataList3.put("url", "https://pokeapi");
		
		list.add(dataList1);
		list.add(dataList2);
		list.add(dataList3);
		
		map.put("count", 1118);
		map.put("next", "https://poke.api");
		map.put("previouse", null);
		map.put("results", list);
		
		System.out.println(map);
	}

}
