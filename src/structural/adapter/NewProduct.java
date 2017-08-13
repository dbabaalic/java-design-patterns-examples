package structural.adapter;

public class NewProduct implements Product{

	private int id;
	private String name;
	private Long price;

	public NewProduct(int id, String name, Long price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Long getPrice() {
		return price;
	}

}
