package creational.builder;

public class IceCreamOrder {

	private int chocolate;
	private int strawberry;
	private int lemon;
	private int raspberry;
	private int snickers;

	public IceCreamOrder(IceCreamOrderBuilder iceCreamOrderBuilder) {
		this.chocolate = iceCreamOrderBuilder.chocolate;
		this.strawberry = iceCreamOrderBuilder.strawberry;
		this.lemon = iceCreamOrderBuilder.lemon;
		this.raspberry = iceCreamOrderBuilder.raspberry;
		this.snickers = iceCreamOrderBuilder.snickers;
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

	public static class IceCreamOrderBuilder {
		private int chocolate;
		private int strawberry;
		private int lemon;
		private int raspberry;
		private int snickers;

		public IceCreamOrderBuilder() {
		}

		public IceCreamOrder build() {
			return new IceCreamOrder(this);
		}

		public IceCreamOrderBuilder chocholate(int chocholate) {
			this.chocolate = chocholate;
			return this;
		}

		public IceCreamOrderBuilder strawberry(int strawberry) {
			this.strawberry = strawberry;
			return this;
		}

		public IceCreamOrderBuilder lemon(int lemon) {
			this.lemon = lemon;
			return this;
		}

		public IceCreamOrderBuilder raspberry(int raspberry) {
			this.raspberry = raspberry;
			return this;
		}

		public IceCreamOrderBuilder snickers(int snickers) {
			this.snickers = snickers;
			return this;
		}
	}

}
