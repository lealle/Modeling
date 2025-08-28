package _01_FactoryPattern;

public class ProductFactory {
	static Product getInstance(String name) {
		Product product = new Product();
		if(name.equalsIgnoreCase("tv")) {
			product.setPrice(300);
		}else if (name.equalsIgnoreCase("computer")) {
			product.setPrice(200);
		}
		product.setName(name);
		return product;
	}
	
	
	
}
