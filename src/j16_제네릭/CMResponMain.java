package j16_제네릭;

import j15_스태틱.싱글톤.Car;

public class CMResponMain {

	public static void main(String[] args) {
		//자동차 생성 요청
		Car car = Car.builder()
				.Company("현대")
				.Model("쏘나타")
				.build();
		
		CMRespDto<Car> cmRespDto = new CMRespDto<Car>(1, "차량 생성 완료", car);
		System.out.println("응답 결과: " + cmRespDto);
		
		
		//해당 차량이 현대자동차인지 확인
		CMRespDto<?> cmRespDto2 = null;
		
		if(car.getCompany().equals("현대")) {
			cmRespDto2 = new  CMRespDto<>(1, "현대 맞음", car);
		} else {
			cmRespDto2 = new  CMRespDto<>(-1, "현대 아님", false);
		}
		System.out.println("응답 결과: " + cmRespDto2);
				
	}

}
