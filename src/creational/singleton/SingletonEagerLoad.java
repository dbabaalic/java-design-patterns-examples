package creational.singleton;

public class SingletonEagerLoad {

	//load at the time jvm loaded up (eager loading)
	private static SingletonEagerLoad instance = new SingletonEagerLoad();
	
	//private to prevent creating new instances
	private SingletonEagerLoad() {

	}
	
	//only one public access to instance
	public static SingletonEagerLoad getInstance() {
		return instance;
	}
}
