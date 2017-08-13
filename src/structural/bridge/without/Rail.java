package structural.bridge.without;

public class Rail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Use two tracks");
	}

}
