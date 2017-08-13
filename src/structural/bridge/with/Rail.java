package structural.bridge.with;

public class Rail implements Train {

	@Override
	public void move(Engine engine) {
		System.out.println("Use two track");
		engine.accelerate();
	}

}
