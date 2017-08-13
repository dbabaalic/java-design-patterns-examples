package creational.prototype;

public class Laptop extends Product {

	private String manufacturer;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Laptop [manufacturer=" + manufacturer + ", title=" + getTitle() + ", price=" + getPrice()
				+ "]";
	}
	
	
	
}
