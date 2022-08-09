package j14_lombok.builder;

public abstract class ProductBuilder {
	protected Product product;  //객체 생성 준비
	
	public Product build() {  //product정보 가져옴
		return product;
	}
	
	public ProductBuilder builder() {  //바로바로 넣을수 있도록
		product = new Product();
		return this;		
	}
	
	public abstract ProductBuilder productCode(int productCode);
	public abstract ProductBuilder productName(String productName);
	public abstract ProductBuilder productCategory(String productCategory);
	public abstract ProductBuilder createDate(String createDate);
}
