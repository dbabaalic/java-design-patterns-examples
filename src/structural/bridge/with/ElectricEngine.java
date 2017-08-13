package structural.bridge.with;

public class ElectricEngine implements Engine {

	@Override
	public void accelerate() {
		System.out.println("Use electric engine");
	}

}
