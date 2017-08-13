package structural.bridge.without;

public class DieselRail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Diesel engine with two tracks");
	}

}
