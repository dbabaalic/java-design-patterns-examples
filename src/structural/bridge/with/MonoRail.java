package structural.bridge.with;

public class MonoRail implements Train {

	@Override
	public void move(Engine engine) {
		System.out.println("Use one track");
		engine.accelerate();
	}

}
