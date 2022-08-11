package j16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
	//CMRespDto: Commit Message Response Data Transfer Object
	//응답에 대한 완료 메세지를 담은 데이터의 변환 객체
	//공통 응답 객체
	private int code;
	private String message;
	private T data;
}
