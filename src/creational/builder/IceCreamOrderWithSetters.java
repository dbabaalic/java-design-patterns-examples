package creational.builder;

public class IceCreamOrderWithSetters {

	private int chocolate;
	private int strawberry;
	private int lemon;
	private int raspberry;
	private int snickers;

	public int getChocolate() {
		return chocolate;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

	public int getStrawberry() {
		return strawberry;
	}

	public void setStrawberry(int strawberry) {
		this.strawberry = strawberry;
	}

	public int getLemon() {
		return lemon;
	}

	public void setLemon(int lemon) {
		this.lemon = lemon;
	}

	public int getRaspberry() {
		return raspberry;
	}

	public void setRaspberry(int raspberry) {
		this.raspberry = raspberry;
	}

	public int getSnickers() {
		return snickers;
	}

	public void setSnickers(int snickers) {
		this.snickers = snickers;
	}

	@Override
	public String toString() {
		return "IceCreamOrder [chocolate=" + chocolate + ", strawberry=" + strawberry + ", lemon=" + lemon
				+ ", raspberry=" + raspberry + ", snickers=" + snickers + "]";
	}

}
