package j05_입력;

public class StringBuilder2 {

	public static void main(String[] args) {
		int index = 0;
		
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		// 김준일/서재효/임나영
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(names.substring(0, 6));
		stringBuilder.append("/");		
		
		stringBuilder.append(names.substring(9, 12));
		stringBuilder.append("/");
		
		stringBuilder.append(names.substring(18, 21));
		stringBuilder.append("/");
		
		stringBuilder.append(names.substring(2, 27));
		
		System.out.println("1");
		System.out.println(stringBuilder.toString());
		
	
		
////////////////////////////////////////////////////////		
		StringBuilder stringBuilder2 = new StringBuilder();
		
		stringBuilder2.append(names);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
				
		System.out.println("2");
		System.out.println(stringBuilder2.toString());
		
		
		StringBuilder stringBuilder3 = new StringBuilder();
		
		index = names.indexOf("님", index + 1);		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");	
		
		index = names.indexOf("님", index + 1);		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");	
		
		index = names.indexOf("님", index + 1);		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");	
		
		index = names.indexOf("님", index + 1);		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");	
		
		index = names.indexOf("님", index + 1);		
		stringBuilder.append(names.substring(index - 3, index));
		
		System.out.println("3");
		System.out.println(stringBuilder3.toString());
		
		
		
		
		
		
//		stringBuilder.append(names);
//		String name1 = stringBuilder.substring(0, 3);
//		String name2 = stringBuilder.substring(6, 9);
//		String name3 = stringBuilder.substring(12, 15);
//		String name4 = stringBuilder.substring(18, 21);
//		String name5 = stringBuilder.substring(24, 27);
//		
//		stringBuilder.append(name1 + name2 + name3 + name4 + name5);
		
	}

}
