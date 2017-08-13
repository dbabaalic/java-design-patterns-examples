package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Product> products = new HashMap<String, Product>();
	
	public Registry () {
		loadProducts();
	}
	
	public Product createProduct(String type) {
		Product product = null;
		try {
			product = (Product)(products.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}

	private void loadProducts() {
		MobilePhone mobilePhone = new MobilePhone();
		mobilePhone.setTitle("LG G3 Mobile Phone");
		mobilePhone.setPrice(250);
		mobilePhone.setModel("LG G3");
		products.put("Mobile Phone", mobilePhone);
		
		Laptop laptop = new Laptop();
		laptop.setTitle("Dell Inspiron 15");
		laptop.setPrice(500);
		laptop.setManufacturer("Dell");
		products.put("Laptop", laptop);
		
	}
	
	
}
