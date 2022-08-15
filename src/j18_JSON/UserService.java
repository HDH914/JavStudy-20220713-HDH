package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	public  static User createUser() {
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구", "농구", "야구", "골프"}));
		
		User user = User.builder()
				.userCode(1)
				.userName(null)
				.password("1234")
				.name("HDH")
				.email("safa@dfas.ga")
				.address("부산")
				.phone("010-6846-2268")
				.hobby(hobby)
				.build();
		return user;
		
		
		
		
		
		
		
						
	}
}
