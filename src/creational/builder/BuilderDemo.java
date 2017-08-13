package creational.builder;

public class BuilderDemo {
	
	
	public static void main(String[] args) {	
		
		// Example with setters(not immutable)
		/*IceCreamOrderWithSetters order = new IceCreamOrderWithSetters();
		order.setChocolate(1);
		order.setSnickers(1);
		System.out.println(order);*/
		
		
		
		// Example constructor telescoping (not configurable)
		/*IceCreamOrderImmutable order = new IceCreamOrderImmutable(1,1);
		// order.setChocholate(2);  ->  not possible 
		System.out.println(order);*/
		
		
		
		// Example using builder
		/*IceCreamOrder order = new IceCreamOrder.IceCreamOrderBuilder()
											   .raspberry(1)
											   .lemon(1)
											   .build();
		System.out.println(order);*/
		
		
	}
	
}
