package j18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	/*
	 * serialize: 객체를 json으로 변환할 때
	 * deserialize: json을 객체로 변환할 때
	 * */
	private int userCode;
	
	@Expose(serialize = true)  //true: 포함된다.  false: 포함x
	private String userName;
	
	private transient String password;    //transient: 비공개
	
	@SerializedName("userName")   //필드명 변환
	private String name;
	
	@Expose(serialize = true, deserialize = true)
	private String email;	
	@Expose(serialize = true, deserialize = false)
	private String address;
	@Expose(serialize = false, deserialize = true)
	private String phone;
	@Expose(serialize = false, deserialize = false)
	private List<String> hobby;
	
}
