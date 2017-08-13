package creational.prototype;

public class MobilePhone extends Product {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MobilePhone [model=" + model + ", title=" + getTitle() + ", price=" + getPrice() + "]";
	}

	
}
