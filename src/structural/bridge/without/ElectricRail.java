package structural.bridge.without;

public class ElectricRail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Electric engine with two track");
	}

}
