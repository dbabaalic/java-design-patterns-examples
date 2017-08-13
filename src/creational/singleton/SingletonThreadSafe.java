package creational.singleton;

public class SingletonThreadSafe {

	private static SingletonThreadSafe instance = null;
	
	//private to prevent creating new instances
	private SingletonThreadSafe() {
	
	}
	
	//only one public access to instance
	//load at the time that instance is requested (lazy loading)
	public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafe.class){
				if (instance == null) {
					instance =  new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}
	
}
