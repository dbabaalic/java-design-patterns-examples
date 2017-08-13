package structural.flyweight;

public class FlyweightDemo 
{
    public static void main( String[] args ) {

        Inventory inventory = new Inventory();

        inventory.takeOrder("Ball", "1");
        inventory.takeOrder("Ball", "2");
        inventory.takeOrder("TV", "3");
        inventory.takeOrder("Headset", "4");
        inventory.takeOrder("Headset", "5");

        inventory.processOrders();

        inventory.report();

    }

}
