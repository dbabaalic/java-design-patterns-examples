package creational.singleton;

public class SingletonLazyLoad {

	private static SingletonLazyLoad instance = null;
	
	//private to prevent creating new instances
	private SingletonLazyLoad() {
	
	}
	
	//only one public access to instance
	//load at the time that instance is requested (lazy loading)
	public static SingletonLazyLoad getInstance() {
		if (instance == null) {
			instance =  new SingletonLazyLoad();
		}
		return instance;
	}
}
