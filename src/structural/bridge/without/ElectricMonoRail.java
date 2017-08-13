package structural.bridge.without;

public class ElectricMonoRail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Electric engine with one track");
	}

}
