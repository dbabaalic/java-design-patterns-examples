package creational.singleton;

public class SingletonDemo {
	
	
	public static void main(String[] args) {

		// Loading Singleton eagerly
		/*SingletonEagerLoad instance = SingletonEagerLoad.getInstance();
		System.out.println(instance);

		SingletonEagerLoad secondInstance = SingletonEagerLoad.getInstance();
		System.out.println(secondInstance);*/
		
		
		
		// Loading Singleton lazily
		/*SingletonLazyLoad instance = SingletonLazyLoad.getInstance();
		System.out.println(instance);
		
		SingletonLazyLoad secondInstance = SingletonLazyLoad.getInstance();
		System.out.println(secondInstance);*/
		
		
		
		// Loading Singleton in thread safe manner
		/*SingletonThreadSafe instance = SingletonThreadSafe.getInstance();
		System.out.println(instance);

		SingletonThreadSafe secondInstance = SingletonThreadSafe.getInstance();
		System.out.println(secondInstance);*/
		
	}
	
}
