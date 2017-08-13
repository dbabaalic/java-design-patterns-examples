package structural.bridge.with;

public class DieselEngine implements Engine {

	@Override
	public void accelerate() {
		System.out.println("Use diesel engine");
	}

}
