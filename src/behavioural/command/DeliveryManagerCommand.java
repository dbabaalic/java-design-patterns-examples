package behavioural.command;

public class DeliveryManagerCommand implements Command {

    @Override
    public void speak() {
        System.out.println("Delivery Manager: We are on track.");
    }
}
