package j15_스태틱.싱글톤;

public class KIA {
	private static KIA instance;
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20220000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
		
		//Car car = new Car(carNumber, company, model);
		
		Car car = Car.builder()
				.Company(company)
				.CarNumber(carNumber)
				.Model(model)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;
			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
		
	}
	
	
	
}
