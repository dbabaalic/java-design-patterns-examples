package creational.builder;

public class IceCreamOrderImmutable {

	private int chocolate;
	private int strawberry;
	private int lemon;
	private int raspberry;
	private int snickers;

	public IceCreamOrderImmutable() {
	}

	public IceCreamOrderImmutable(int chocolate, int strawberry) {
		this(chocolate, strawberry, 0, 0, 0);
	}

	public IceCreamOrderImmutable(int chocolate, int strawberry, int lemon) {
		this(chocolate, strawberry, lemon, 0, 0);
	}

	public IceCreamOrderImmutable(int chocolate, int strawberry, int lemon, int raspberry) {
		this(chocolate, strawberry, lemon, raspberry, 0);
	}

	public IceCreamOrderImmutable(int chocolate, int strawberry, int lemon, int raspberry, int snickers) {
		this.chocolate = chocolate;
		this.strawberry = strawberry;
		this.lemon = lemon;
		this.raspberry = raspberry;
		this.snickers = snickers;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getStrawberry() {
		return strawberry;
	}

	public int getLemon() {
		return lemon;
	}

	public int getRaspberry() {
		return raspberry;
	}

	public int getSnickers() {
		return snickers;
	}

	@Override
	public String toString() {
		return "IceCreamOrder [chocolate=" + chocolate + ", strawberry=" + strawberry + ", lemon=" + lemon
				+ ", raspberry=" + raspberry + ", snickers=" + snickers + "]";
	}

}
