package structural.bridge.without;

public class MonoRail implements TrainWithoutBridge {

	@Override
	public void move() {
		System.out.println("Use one track");
	}

}
