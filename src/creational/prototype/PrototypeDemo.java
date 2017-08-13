package creational.prototype;

public class PrototypeDemo {
	
	
	public static void main(String[] args) {

		Registry registry = new Registry();
		Laptop laptop = (Laptop) registry.createProduct("Laptop");
		laptop.setPrice(400);
		System.out.println(laptop);
		
		Laptop secondLaptop = (Laptop) registry.createProduct("Laptop");
		secondLaptop.setPrice(600);
		System.out.println(secondLaptop);
		
	}
	
}
