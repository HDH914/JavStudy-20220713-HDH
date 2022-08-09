package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
//@AllArgsConstructor
public class User {
	
	private String email;
	private String name;
	@NonNull  //값을 무조건 넣어야함
	private String username;
	@NonNull
	private String password;
	
	public User(String username, String password) {
		this.username = username; 
		this.password = password;
	}
}
