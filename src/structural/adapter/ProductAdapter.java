package structural.adapter;

public class ProductAdapter implements Product {

	private LegacyProduct legacyProduct;

	public ProductAdapter(LegacyProduct legacyProduct) {
		this.legacyProduct = legacyProduct;
	}

	@Override
	public int getId() {
		return Integer.valueOf(legacyProduct.getUniqueNumber());
	}

	@Override
	public String getName() {
		return legacyProduct.getProductName();
	}

	@Override
	public Long getPrice() {
		return legacyProduct.getProductPrice();
	}

}
