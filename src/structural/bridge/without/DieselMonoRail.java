package structural.bridge.without;

public class DieselMonoRail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Diesel engine with one track");
	}

}
