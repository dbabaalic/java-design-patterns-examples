package structural.adapter;

public class LegacyProduct {

	private String uniqueNumber;
	private String productName;
	private Long productPrice;
	
	public LegacyProduct(String uniqueNumber, String productName, Long productPrice) {
		this.uniqueNumber = uniqueNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public String getProductName() {
		return productName;
	}

	public Long getProductPrice() {
		return productPrice;
	}

}
