package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.err.println("Ürün ilgileri geçersizdir!");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.birsey(); 
	}

}
