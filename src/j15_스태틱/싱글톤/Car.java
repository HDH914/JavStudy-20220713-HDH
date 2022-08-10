package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Car {
	private int CarNumber;
	private String Company;
	private String Model;
}
