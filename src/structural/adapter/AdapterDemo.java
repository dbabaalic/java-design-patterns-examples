package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();

		Product newProduct = new NewProduct(1, "New Laptop", 250l);
		products.add(newProduct);

		// This wont work (LegacyProduct doesn't implement Product)
		// Product legacyProduct = new LegacyProduct(233, "Legacy Laptop", 200l);

		LegacyProduct legacyProduct = new LegacyProduct("233", "Legacy Laptop", 200l);
		products.add(new ProductAdapter(legacyProduct));
		
		System.out.println(products);

	}

}
