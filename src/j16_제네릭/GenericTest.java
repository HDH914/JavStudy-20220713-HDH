package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<K, V> {  //T = type  E = element  T > E T가 더 상위
	private K key;
	private V value;
}
