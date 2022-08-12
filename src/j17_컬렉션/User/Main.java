package j17_컬렉션.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * Map 안에 리스트 안에 Map을 저장하는 구조를 배운다.
		 * */
		
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	
	
		Map<String, Object> mapList1 = new HashMap<String, Object>();
		mapList1.put("todoCode", 182);
		mapList1.put("todo", "스프링 부트 서버 테스트_182");
		mapList1.put("todoComplete", true);
		mapList1.put("inportance", false);
		mapList1.put("toralCount", 157);
		mapList1.put("toralCount", 157);
		
		Map<String, Object> mapList2 = new HashMap<String, Object>();
		mapList2.put("todoCode", 182);
		mapList2.put("todo", "스프링 부트 서버 테스트_182");
		mapList2.put("todoComplete", true);
		mapList2.put("inportance", false);
		mapList2.put("toralCount", 157);
		mapList2.put("toralCount", 157);
		
		list.add(mapList1);
		list.add(mapList2);
		
		datamap.put("code", 1);
		datamap.put("message", "1page list success to load");
		datamap.put("data", list);
		
		System.out.println(datamap);
	}

}
